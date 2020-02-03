package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class Listener extends SqliteBaseListener {

    private static String traduccion = "";
    private static String file = "output.txt";
    //en esta variable se van a guardar los esquemas de la base de datos puesto que la gramtaica no distingue tablas y esquemas
    private static ArrayList<String> databases = new ArrayList<>();
    private static ArrayList<String> tables = new ArrayList<>();
    private static ArrayList<String> indexes = new ArrayList<>();
    //en esta se guardan los tres tipos de collation de sqlite
    private static final String[] collations = {"binary", "rtrim", "nocase"};
    private static ArrayList<String> triggerTable = new ArrayList<>();

    public static void escribirTraduccion(String file) {
        String str = "";
        str = "-- Generated postgreSQL file from SQLite\n-- Final ANTLRv4 Project LP 2019-II\n-- By Tom Erick Perez, Felipe Pieschacon and Juan Nicolas Nobza\n\n" + System.lineSeparator() + traduccion;
        crearArchivo(file, str);
        traduccion = "";
    }

    private static void crearArchivo(String file, String str) {
        try {
            File f = new File(file);
            FileWriter fr = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fr);
            PrintWriter out = new PrintWriter(bw);
            out.println(str);
            out.close();
            bw.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("Error de escritura: " + e.toString());
        }
    }


    @Override
    public void enterParse(SqliteParser.ParseContext ctx) {
        //los esquemas default que tiene SQLite
        databases.add("main");
        databases.add("temp");
        super.enterParse(ctx);
    }

    @Override
    public void exitParse(SqliteParser.ParseContext ctx) {
        String a = ctx.getText();
        //escribirTraduccion(file);
        super.exitParse(ctx);
    }

    @Override
    public void enterAlter_table_stmt(SqliteParser.Alter_table_stmtContext ctx) {
        String a = "ALTER TABLE " + ctx.table_name().getText();
        if (ctx.K_RENAME() != null) {
            a += " RENAME TO " + ctx.new_table_name().getText();
        } else if (ctx.K_ADD() != null) {
            a += " ADD ";
            if (ctx.K_COLUMN() != null) {
                a += "COLUMN ";
            }
        }
        System.out.println(a);
        traduccion += a;
        super.enterAlter_table_stmt(ctx);
    }
    @Override
    public void enterColumn_def(SqliteParser.Column_defContext ctx){
        String a="";
        a+=ctx.column_name().getText();
        if (ctx.type_name()!= null){
            for(int i = 0; i < ctx.type_name().getChildCount(); i++){
                a += " " + ctx.type_name().getChild(i).getText().toUpperCase();
            }
        }
        if(!ctx.column_constraint().isEmpty()){
            for(int i=0; i<ctx.column_constraint().size(); i++){
                SqliteParser.Column_constraintContext b = ctx.column_constraint().get(i);
                if (b.K_CONSTRAINT()!=null){
                    a+=" CONSTRAINT "+b.name().getText()+",";
                }else if (b.K_PRIMARY()!=null){
                    a+=" PRIMARY KEY";
                    if (b.conflict_clause().K_ON()!=null){
                        a+=" ON CONFLICT "+b.conflict_clause().getChild(2).getText().toUpperCase();
                    }
                    if (b.K_AUTOINCREMENT()!=null){
                        a+=" SERIAL";
                    }
                }else if (b.K_NULL()!= null){
                    if (b.K_NOT()!=null){
                        a+=" NOT ";
                    }
                    a+=" NULL ";
                    if (b.conflict_clause().K_ON()!=null){
                        a+=" ON CONFLICT "+b.conflict_clause().getChild(2).getText().toUpperCase();
                    }
                }else if (b.K_UNIQUE()!=null){
                    a+=" UNIQUE";
                    if (b.conflict_clause().K_ON()!=null){
                        a+=" ON CONFLICT "+b.conflict_clause().getChild(2).getText().toUpperCase();
                    }
                }else if (b.K_CHECK()!=null){
                    a+=" CHECK ("+b.expr().getText()+")";
                }else if (b.K_DEFAULT()!=null){
                    a+=" DEFAULT "+b.getChild(1).getText();
                    if(b.expr()!=null){
                        a+=b.expr().getText()+")";
                    }
                }else if (b.K_COLLATE()!=null){
                    a+=" COLLATE "+b.collation_name().getText();
                }else{
                    SqliteParser.Foreign_key_clauseContext c =b.foreign_key_clause();
                    a+=" REFERENCES "+c.foreign_table().getText();
                    if (c.getText().contains("(")){
                        a+=c.getText().substring(c.getText().indexOf("("),c.getText().indexOf(")"));
                    }
                    if (c.K_UPDATE()!=null){
                        a+=" ON UPDATE";
                        if (c.getText().toUpperCase().contains("UPDATESETNULL")){
                            a+=" SET NULL";
                        }else if(c.getText().toUpperCase().contains("UPDATESETDEFAULT")){
                            a+=" SET DEFAULT";
                        }else if(c.getText().toUpperCase().contains("UPDATECASCADE")){
                            a+=" CASCADE";
                        }else if(c.getText().toUpperCase().contains("UPDATERESTRICT")){
                            a+=" RESTRICT";
                        }else {
                            a+=" NO ACTION";
                        }
                    }
                    if (c.K_DELETE()!=null){
                        a+=" ON DELETE";
                        if (c.getText().toUpperCase().contains("DELETESETNULL")){
                            a+=" SET NULL";
                        }else if(c.getText().toUpperCase().contains("DELETESETDEFAULT")){
                            a+=" SET DEFAULT";
                        }else if(c.getText().toUpperCase().contains("DELETECASCADE")){
                            a+=" CASCADE";
                        }else if(c.getText().toUpperCase().contains("DELETERESTRICT")){
                            a+=" RESTRICT";
                        }else {
                            a+=" NO ACTION";
                        }
                    }
                    if (c.K_MATCH()!=null){
                        a+=" MATCH "+c.name().get(0).getText();
                    }
                    if (c.K_DEFERRABLE()!=null){
                        if(c.K_NOT()!=null){
                            a+=" NOT";
                        }
                        a+=" DEFERRABLE";
                        if (c.K_DEFERRED()!=null){
                            a+=" INITIALLY DEFERRED";
                        }else if(c.K_IMMEDIATE()!=null){
                            a+=" INITIALLY IMMEDIATE";
                        }
                    }
                }
            }
        }
        if(ctx.getParent().getChild(ctx.getParent().getChildCount()-2).getText().equals(ctx.getText())||ctx.getParent().getChild(ctx.getParent().getChildCount()-3).getText().equals(ctx.getText())) {
            if(ctx.getParent().getText().toLowerCase().contains("createtable"))
                a += ");\n";
            else
                a += ";\n";
        }else{
            a += ",\n";
        }
        System.out.println(a);
        traduccion += a;
        super.enterColumn_def(ctx);
    }

    @Override
    public void enterAnalyze_stmt(SqliteParser.Analyze_stmtContext ctx) {
        String a = "ANALYZE VERBOSE";
        System.out.print(a);
        traduccion += a;
        super.enterAnalyze_stmt(ctx);
    }

    @Override
    public void enterAttach_stmt(SqliteParser.Attach_stmtContext ctx) {
        String a = "CREATE SCHEMA";
        System.out.print(a);
        traduccion += a;
        super.enterAttach_stmt(ctx);
    }

    @Override
    public void enterBegin_stmt(SqliteParser.Begin_stmtContext ctx) {
        String a = "BEGIN";
        if (ctx.getText().toLowerCase().contains("transaction")) {
            a += " TRANSACTION;\n";
        } else {
            a += ";\n";
        }
        System.out.print(a);
        traduccion += a;
        super.enterBegin_stmt(ctx);
    }

    @Override
    public void enterCompound_operator(SqliteParser.Compound_operatorContext ctx) {
        String a = "";
        if (ctx.K_UNION() != null) {
            a += "UNION";
        } else if (ctx.K_ALL() != null) {
            a += "UNION ALL";
        } else if (ctx.K_INTERSECT() != null) {
            a += "INTERSECT";
        } else if (ctx.K_EXCEPT() != null) {
            a += "EXCEPT";
        }
        traduccion += a;
        System.out.println(a);
        super.enterCompound_operator(ctx);
    }

    @Override
    public void enterCommit_stmt(SqliteParser.Commit_stmtContext ctx) {
        String a = "";
        if (ctx.getChild(0).getText().toLowerCase().equals("commit")) {
            a = "COMMIT";
        } else {
            a = "END";
        }

        if (ctx.getText().toLowerCase().contains("transaction")) {
            a += " TRANSACTION;\n";
        } else {
            a += ";\n";
        }
        System.out.print(a);
        traduccion += a;
        super.enterCommit_stmt(ctx);
    }

    @Override
    public void enterCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx) {
        String a = "CREATE";
        if (ctx.K_UNIQUE() != null) {
            a += " UNIQUE";
        }
        a += " INDEX ";
        if (ctx.K_IF() != null) {
            a += " IF NOT EXISTS";
        }
        if (ctx.database_name() != null) {
            a += ctx.database_name().getText() + ".";
        }
        a += ctx.index_name().getText() + " ON " + ctx.table_name().getText() + " (";
        traduccion += a;
        System.out.println(a);
        super.enterCreate_index_stmt(ctx);
    }

    @Override
    public void exitCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx) {
        String a = "";
        a += ")";
        if (ctx.K_WHERE() != null) {
            a += " WHERE" + ctx.expr().getText();
        }
        a += ";\n";
        traduccion += a;
        System.out.println(a);
        indexes.add(ctx.index_name().getText());
        super.exitCreate_index_stmt(ctx);
    }

    @Override
    public void enterCreate_table_stmt(SqliteParser.Create_table_stmtContext ctx) {
        String a = "CREATE";
        if (ctx.K_TEMPORARY() != null) {
            a += " TEMPORARY";
        } else if (ctx.K_TEMP() != null) {
            a += " TEMP";
        }
        a += " TABLE ";
        if (ctx.K_IF() != null) {
            a += "IF NOT EXISTS ";
        }
        if (ctx.database_name() != null) {
            a += ctx.database_name().getText() + ".";
        }
        a += ctx.table_name().getText();
        a += "(";
        /*if (ctx.column_def() != null) {
            a += "(";
            for (int i = 0; i < ctx.column_def().size(); i++) {
                if (i == (ctx.column_def().size() - 1)) {
                    a += ctx.column_def(i).getText();
                    System.out.println(ctx.column_def(i).getText());
                } else {
                    a += ctx.column_def(i).getText() + ", ";
                    System.out.println(ctx.column_def(i).getText() + ", ");
                }
            }
            if (ctx.table_constraint() != null) {
                for (int i = 0; i < ctx.table_constraint().size(); i++) {
                    if (i == (ctx.table_constraint().size() - 1)) {
                        a += ctx.table_constraint(i).getText();
                        System.out.println(ctx.table_constraint(i).getText());
                    } else {
                        a += ctx.table_constraint(i).getText() + ", ";
                        System.out.println(ctx.table_constraint(i).getText() + ", ");
                    }
                }
            }
            a += ")";
            if (ctx.K_WITHOUT() != null) {
                a += " WITHOUT" + ctx.IDENTIFIER().getText();
            }
        }*/
        if (ctx.K_AS() != null) {
            a += " AS ";
        }
        traduccion += a;
        System.out.println(a);
        super.enterCreate_table_stmt(ctx);
    }

    @Override
    public void enterCreate_trigger_stmt(SqliteParser.Create_trigger_stmtContext ctx) {
        String a = "CREATE";
        if (ctx.K_TEMP() != null) {
            a += " TEMP";
        } else if (ctx.K_TEMPORARY() != null) {
            a += " TEMPORARY";
        }
        a += " TRIGGER ";
        if (ctx.K_IF() != null) {
            a += " IF NOT EXISTS ";
        }
        if (ctx.database_name(0) != null) {
            a += ctx.database_name(0).getText() + ".";
        }
        a += ctx.trigger_name().getText();
        triggerTable.add(ctx.trigger_name().getText());
        if (ctx.K_BEFORE() != null) {
            a += " BEFORE";
        } else if (ctx.K_AFTER() != null) {
            a += " AFTER";
        } else if (ctx.K_INSTEAD() != null) {
            a += " INSTEAD OF";
        }
        if (ctx.K_DELETE() != null) {
            a += " DELETE";
        } else if (ctx.K_INSERT() != null) {
            a += " INSERT";
        } else if (ctx.K_UPDATE() != null) {
            a += " UPDATE";
            if (ctx.K_OF() != null) {
                a += " OF";
                for (int i = 0; i < ctx.column_name().size(); i++) {
                    if (i == (ctx.column_name().size() - 1)) {
                        a += ctx.column_name(i).getText();
                        System.out.println(ctx.column_name(i).getText());
                    } else {
                        a += ctx.column_name(i).getText() + ", ";
                        System.out.println(ctx.column_name(i).getText() + ", ");
                    }
                }
            }
        }

        a += " ON ";

        if (ctx.database_name(1) != null) {
            a += ctx.database_name(1).getText() + ".";
        }
        a += ctx.table_name().getText();
        triggerTable.add(ctx.table_name().getText());
        if (ctx.K_FOR() != null) {
            a += " FOR EACH ROW";
        }
        if (ctx.K_WHEN() != null) {
            a += " WHEN" + ctx.expr().getText();
        }

        a += " BEGIN\n";
        /*if (ctx.update_stmt() != null) {

            for (int i = 0; i < ctx.update_stmt().size(); i++) {
                a += ctx.update_stmt(i).getText() + ";";
                System.out.println(ctx.update_stmt(i).getText() + ";");
            }
        }
        if (ctx.insert_stmt() != null) {
            for (int i = 0; i < ctx.insert_stmt().size(); i++) {
                a += ctx.insert_stmt(i).getText() + ";";
                System.out.println(ctx.insert_stmt(i).getText() + ";");
            }
        }
        if (ctx.delete_stmt() != null) {
            for (int i = 0; i < ctx.delete_stmt().size(); i++) {
                a += ctx.delete_stmt(i).getText() + ";";
                System.out.println(ctx.delete_stmt(i).getText() + ";");
            }
        }
        if (ctx.select_stmt() != null) {
            for (int i = 0; i < ctx.select_stmt().size(); i++) {
                a += ctx.select_stmt(i).getText() + ";";
                System.out.println(ctx.select_stmt(i).getText() + ";");
            }

        }*/

        traduccion += a;
        System.out.println(a);
        super.enterCreate_trigger_stmt(ctx);
    }

    @Override

    public void exitCreate_trigger_stmt(SqliteParser.Create_trigger_stmtContext ctx) {
        String a = "END;\n";
        traduccion += a;
        System.out.println(a);
        super.exitCreate_trigger_stmt(ctx);
    }

    @Override

    public void enterCreate_view_stmt(SqliteParser.Create_view_stmtContext ctx) {
        String a = "CREATE";
        if (ctx.K_TEMP() != null) {
            a += " TEMP";
        } else if (ctx.K_TEMPORARY() != null) {
            a += " TEMPORARY";
        }
        a += " VIEW ";
        if (ctx.K_IF() != null) {
            a += "IF NOT EXISTS ";
        }
        if (ctx.database_name() != null) {
            a += ctx.database_name().getText() + ".";
        }
        a += ctx.view_name().getText() + " AS ";
        traduccion += a;
        System.out.println(a);
        super.enterCreate_view_stmt(ctx);
    }

    @Override
    public void enterDelete_stmt(SqliteParser.Delete_stmtContext ctx) {
        String a = "";
        if (ctx.with_clause() != null) {
            a += ctx.with_clause().getText();
        }
        a += " DELETE FROM ";
        traduccion += a;
        System.out.println(a);
        super.enterDelete_stmt(ctx);
    }

    @Override
    public void exitDelete_stmt(SqliteParser.Delete_stmtContext ctx) {
        String a = "";
        if (ctx.K_WHERE() != null) {
            a += "WHERE " + ctx.expr().getText();
        }
        a += ";\n";
        traduccion += a;
        System.out.println(a);
        super.exitDelete_stmt(ctx);
    }

    @Override
    public void enterDelete_stmt_limited(SqliteParser.Delete_stmt_limitedContext ctx) {
        String a = "";
        if (ctx.with_clause() != null) {
            a += ctx.with_clause().getText();
        }
        a += "DELETE FROM ";
        traduccion += a;
        System.out.println(a);
        super.enterDelete_stmt_limited(ctx);
    }

    @Override
    public void exitDelete_stmt_limited(SqliteParser.Delete_stmt_limitedContext ctx) {
        String a = "";
        if (ctx.K_WHERE() != null) {
            a += "WHERE " + ctx.expr(0).getText();
        }
        if (ctx.K_LIMIT() != null) {
            if (ctx.K_ORDER() != null) {
                a += "ORDER BY ";
                for (int i = 0; i < ctx.ordering_term().size(); i++) {
                    if (i == (ctx.ordering_term().size() - 1)) {
                        a += ctx.ordering_term(i).getText();
                        System.out.println(ctx.ordering_term(i).getText());
                    } else {
                        a += ctx.ordering_term(i).getText() + ", ";
                        System.out.println(ctx.ordering_term(i).getText() + ", ");
                    }
                }
            }
            a += "LIMIT " + ctx.expr(1).getText();
            if (ctx.expr(2) != null) {
                if (ctx.K_OFFSET() != null) {
                    a += "OFFSET ";
                } else {
                    a += ",";
                }
                a += ctx.expr(2).getText();
            }
        }
        traduccion += a;
        System.out.println((a));
        super.exitDelete_stmt_limited(ctx);
    }

    @Override

    public void enterUpdate_stmt(SqliteParser.Update_stmtContext ctx) {
        String a = "";
        if (ctx.with_clause() != null) {
            a += ctx.with_clause().getText();
        }
        a += " UPDATE ";

        traduccion += a;
        System.out.println(a);
        super.enterUpdate_stmt(ctx);
    }

    @Override
    public void exitUpdate_stmt(SqliteParser.Update_stmtContext ctx) {
        String a = " SET ";

        for(int i=0; i < ctx.column_name().size(); i++){
            if(i == ctx.column_name().size()-1){
                a += ctx.column_name().get(i).getText() + " = " + ctx.expr().get(i).getText() + " ";
            }else{
                a += ctx.column_name().get(i).getText() + " = " + ctx.expr().get(i).getText() + ", ";
            }
        }
        if (ctx.K_WHERE() != null) {
            a += "WHERE " + ctx.expr().get(ctx.expr().size()-1).getText();
        }
        a += ";\n";
        traduccion += a;
        System.out.println(a);
        super.exitUpdate_stmt(ctx);
    }

    @Override
    public void enterUpdate_stmt_limited(SqliteParser.Update_stmt_limitedContext ctx) {
        String a = "";
        if (ctx.with_clause() != null) {
            a += ctx.with_clause().getText();
        }
        a += " UPDATE ";
        traduccion += a;
        System.out.println(a);
        super.enterUpdate_stmt_limited(ctx);
    }

    @Override
    public void exitUpdate_stmt_limited(SqliteParser.Update_stmt_limitedContext ctx) {
        String a = " SET ";

        for(int i=0; i < ctx.column_name().size(); i++){
            if(i == ctx.column_name().size()-1){
                a += ctx.column_name().get(i).getText() + " = " + ctx.expr().get(i).getText() + " ";
            }else{
                a += ctx.column_name().get(i).getText() + " = " + ctx.expr().get(i).getText() + ", ";
            }
        }
        if (ctx.K_WHERE() != null) {
            a += "WHERE " + ctx.expr(ctx.expr().size()-3).getText();
        }
        if (ctx.K_LIMIT() != null) {
            if (ctx.K_ORDER() != null) {
                a += "ORDER BY ";
                for (int i = 0; i < ctx.ordering_term().size(); i++) {
                    if (i == (ctx.ordering_term().size() - 1)) {
                        a += ctx.ordering_term(i).getText();
                        System.out.println(ctx.ordering_term(i).getText());
                    } else {
                        a += ctx.ordering_term(i).getText() + ", ";
                        System.out.println(ctx.ordering_term(i).getText() + ", ");
                    }
                }
            }
            a += "LIMIT " + ctx.expr(ctx.expr().size()-2).getText();
            if (ctx.expr(ctx.expr().size()-1) != null) {
                if (ctx.K_OFFSET() != null) {
                    a += "OFFSET ";
                } else {
                    a += ",";
                }
                a += ctx.expr(ctx.expr().size()-1).getText();
            }
        }
        traduccion += a;
        System.out.println((a));
        super.exitUpdate_stmt_limited(ctx);
    }

    @Override

    public void enterDetach_stmt(SqliteParser.Detach_stmtContext ctx) {
        String a = "DROP SCHEMA";
        System.out.print(a);
        traduccion += a;
        super.enterDetach_stmt(ctx);
    }

    @Override
    public void enterDrop_index_stmt(SqliteParser.Drop_index_stmtContext ctx) {
        String a = "DROP INDEX";
        if (ctx.getChildCount() >= 4) {
            if (ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")) {
                a += " IF EXISTS";
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterDrop_index_stmt(ctx);
    }

    @Override
    public void exitDrop_index_stmt(SqliteParser.Drop_index_stmtContext ctx) {
        String a = ";\n";
        System.out.print(a);
        traduccion += a;
        indexes.remove(ctx.index_name().getText());
        super.exitDrop_index_stmt(ctx);
    }

    @Override
    public void enterDrop_table_stmt(SqliteParser.Drop_table_stmtContext ctx) {
        String a = "DROP TABLE";
        if (ctx.getChildCount() >= 4) {
            if (ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")) {
                a += " IF EXISTS";
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterDrop_table_stmt(ctx);
    }

    @Override
    public void exitDrop_table_stmt(SqliteParser.Drop_table_stmtContext ctx) {
        String a = " RESTRICT;\n";
        System.out.print(a);
        traduccion += a;
        super.exitDrop_table_stmt(ctx);
    }

    @Override
    public void enterDrop_trigger_stmt(SqliteParser.Drop_trigger_stmtContext ctx) {
        String a = "DROP TRIGGER";
        if (ctx.getChildCount() >= 4) {
            if (ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")) {
                a += " IF EXISTS";
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterDrop_trigger_stmt(ctx);
    }

    @Override
    public void exitDrop_trigger_stmt(SqliteParser.Drop_trigger_stmtContext ctx) {
        String a = " ON ";
        a+= triggerTable.get(triggerTable.indexOf(ctx.trigger_name().getText())+1);
        a += " RESTRICT;\n";
        System.out.print(a);
        traduccion += a;
        super.exitDrop_trigger_stmt(ctx);
    }

    @Override
    public void enterDrop_view_stmt(SqliteParser.Drop_view_stmtContext ctx) {
        String a = "DROP VIEW";
        if (ctx.getChildCount() >= 4) {
            if (ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")) {
                a += " IF EXISTS";
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterDrop_view_stmt(ctx);
    }

    @Override
    public void exitDrop_view_stmt(SqliteParser.Drop_view_stmtContext ctx) {
        String a = " RESTRICT;\n";
        System.out.print(a);
        traduccion += a;
        super.exitDrop_view_stmt(ctx);
    }

    @Override
    public void enterQualified_table_name(SqliteParser.Qualified_table_nameContext ctx) {
        String a = "";
        if (ctx.database_name() != null) {
            a += ctx.database_name().getText() + ".";
        }
        a += ctx.table_name().getText();
        if (ctx.K_BY() != null) {
            a += " INDEXED BY " + ctx.index_name().getText();
        } else if (ctx.K_NOT() != null) {
            a += " NOT INDEXED";
        }
        traduccion += a;
        System.out.println(a);
        super.enterQualified_table_name(ctx);
    }

    @Override
    public void enterReindex_stmt(SqliteParser.Reindex_stmtContext ctx) {
        String a = "REINDEX";
        if (ctx.getChildCount() == 1) {
            a += " DATABASE public;\n";
            for (String db : databases) {
                if (!db.equals("main")) {
                    a += "REINDEX DATABASE " + db + ";\n";
                }
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterReindex_stmt(ctx);
    }

    @Override
    public void exitReindex_stmt(SqliteParser.Reindex_stmtContext ctx) {
        String a = "";
        if (ctx.getChildCount() > 2)
            a = ";\n";
        System.out.print(a);
        traduccion += a;
        super.exitReindex_stmt(ctx);
    }

    @Override
    public void enterRelease_stmt(SqliteParser.Release_stmtContext ctx) {
        String a = "RELEASE";
        if (ctx.getText().toLowerCase().contains("savepoint")) {
            a += " SAVEPOINT";
        }
        System.out.print(a);
        traduccion += a;
        super.enterRelease_stmt(ctx);
    }

    @Override
    public void enterRollback_stmt(SqliteParser.Rollback_stmtContext ctx) {
        String a = "ROLLBACK";
        if (ctx.getText().toLowerCase().contains("transaction")) {
            a += " TRANSACTION";
        }

        if (ctx.getText().toLowerCase().contains("to")) {
            a += " TO ";
        } else {
            a += ";\n";
        }

        System.out.print(a);
        traduccion += a;
        super.enterRollback_stmt(ctx);
    }

    @Override
    public void enterSavepoint_stmt(SqliteParser.Savepoint_stmtContext ctx) {
        String a = "SAVEPOINT";
        System.out.print(a);
        traduccion += a;
        super.enterSavepoint_stmt(ctx);
    }

    @Override
    public void enterSimple_select_stmt(SqliteParser.Simple_select_stmtContext ctx) {
        String a = "";
        if (ctx.K_WITH() != null) {
            a += "WITH" + ((ctx.K_RECURSIVE() != null) ? ctx.K_RECURSIVE().getText() : " ");
            for (int i = 0; i < ctx.common_table_expression().size(); i++) {
                if (i == (ctx.common_table_expression().size() - 1)) {
                    a += ctx.common_table_expression(i).getText();
                    System.out.println(ctx.common_table_expression(i).getText());
                } else {
                    a += ctx.common_table_expression(i).getText() + ", ";
                    System.out.println(ctx.common_table_expression(i).getText() + ", ");
                }
            }
        }
        traduccion += a;
        System.out.println(a);
        super.enterSimple_select_stmt(ctx);
    }

    @Override
    public void exitSimple_select_stmt(SqliteParser.Simple_select_stmtContext ctx) {
        String a = "";
        if (ctx.K_ORDER() != null) {
            a += " ORDER BY ";
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                if (i == (ctx.ordering_term().size() - 1)) {
                    a += ctx.ordering_term(i).getText();
                    System.out.println(ctx.ordering_term(i).getText());
                } else {
                    a += ctx.ordering_term(i).getText() + ", ";
                    System.out.println(ctx.ordering_term(i).getText() + ", ");
                }
            }
        }
        if (ctx.K_LIMIT() != null) {
            a += " LIMIT " + ctx.expr(0).getText();
            if (ctx.expr(1) != null) {
                if (ctx.K_OFFSET() != null) {
                    a += " OFFSET ";
                } else {
                    a += ", ";
                }
                a += ctx.expr(1).getText();
            }
        }
        traduccion += a;
        System.out.println(a);
        super.exitSimple_select_stmt(ctx);

    }

    @Override
    public void enterSelect_stmt(SqliteParser.Select_stmtContext ctx) {
        String a = "";
        if (ctx.K_WITH() != null) {
            a += "WITH" + ((ctx.K_RECURSIVE() != null) ? ctx.K_RECURSIVE().getText() : " ");
            for (int i = 0; i < ctx.common_table_expression().size(); i++) {
                if (i == (ctx.common_table_expression().size() - 1)) {
                    a += ctx.common_table_expression(i).getText();
                    System.out.println(ctx.common_table_expression(i).getText());
                } else {
                    a += ctx.common_table_expression(i).getText() + ", ";
                    System.out.println(ctx.common_table_expression(i).getText() + ", ");
                }
            }
        }
        traduccion += a;
        System.out.println(a);
        ;
        super.enterSelect_stmt(ctx);
    }

    @Override
    public void exitSelect_stmt(SqliteParser.Select_stmtContext ctx) {
        String a = "";
        if (ctx.K_ORDER() != null) {
            a += "ORDER BY ";
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                if (i == (ctx.ordering_term().size() - 1)) {
                    a += ctx.ordering_term(i).getText();
                    System.out.println(a += ctx.ordering_term(i).getText());
                } else {
                    a += a += ctx.ordering_term(i).getText() + ", ";
                    System.out.println(a += ctx.ordering_term(i).getText() + ", ");
                }
            }
        }
        if (ctx.K_LIMIT() != null) {
            a += " LIMIT " + ctx.expr(0).getText();

            if (ctx.expr(1) != null) {
                if (ctx.K_OFFSET() != null) {
                    a += " OFFSET ";
                } else {
                    a += ", ";
                }
                a += ctx.expr(1).getText();
            }
        }
        traduccion += a;
        System.out.println(a);
        super.exitSelect_stmt(ctx);
    }

    @Override
    public void enterFactored_select_stmt(SqliteParser.Factored_select_stmtContext ctx) {
        String a = "";
        if (ctx.K_WITH() != null) {
            a += "WITH" + ((ctx.K_RECURSIVE() != null) ? ctx.K_RECURSIVE().getText() : " ");
            for (int i = 0; i < ctx.common_table_expression().size(); i++) {
                if (i == (ctx.common_table_expression().size() - 1)) {
                    a += ctx.common_table_expression(i).getText();
                    System.out.println(ctx.common_table_expression(i).getText());
                } else {
                    a += ctx.common_table_expression(i).getText() + ", ";
                    System.out.println(ctx.common_table_expression(i).getText() + ", ");
                }
            }
        }
        traduccion += a;
        System.out.println(a);
        super.enterFactored_select_stmt(ctx);
    }

    @Override
    public void exitFactored_select_stmt(SqliteParser.Factored_select_stmtContext ctx) {
        String a = "";
        if (ctx.K_ORDER() != null) {
            a += "ORDER BY ";
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                if (i == (ctx.ordering_term().size() - 1)) {
                    a += ctx.ordering_term(i).getText();
                    System.out.println(a += ctx.ordering_term(i).getText());
                } else {
                    a += a += ctx.ordering_term(i).getText() + ", ";
                    System.out.println(a += ctx.ordering_term(i).getText() + ", ");
                }
            }
        }
        if (ctx.K_LIMIT() != null) {
            a += " LIMIT " + ctx.expr(0).getText();

            if (ctx.expr(1) != null) {
                if (ctx.K_OFFSET() != null) {
                    a += " OFFSET ";
                } else {
                    a += ", ";
                }
                a += ctx.expr(1).getText();
            }
        }
        traduccion += a;
        System.out.println(a);
        super.exitFactored_select_stmt(ctx);
    }

    @Override
    public void enterCompound_select_stmt(SqliteParser.Compound_select_stmtContext ctx) {
        String a = "";
        if (ctx.K_WITH() != null) {
            a += "WITH" + ((ctx.K_RECURSIVE() != null) ? ctx.K_RECURSIVE().getText() : " ");
            for (int i = 0; i < ctx.common_table_expression().size(); i++) {
                if (i == (ctx.common_table_expression().size() - 1)) {
                    a += ctx.common_table_expression(i).getText();
                    System.out.println(ctx.common_table_expression(i).getText());
                } else {
                    a += ctx.common_table_expression(i).getText() + ", ";
                    System.out.println(ctx.common_table_expression(i).getText() + ", ");
                }
            }
        }
        traduccion += a;
        System.out.println(a);
        super.enterCompound_select_stmt(ctx);
    }

    @Override
    public void exitCompound_select_stmt(SqliteParser.Compound_select_stmtContext ctx) {
        String a = "";
        if (ctx.K_ORDER() != null) {
            a += "ORDER BY ";
            for (int i = 0; i < ctx.ordering_term().size(); i++) {
                if (i == (ctx.ordering_term().size() - 1)) {
                    a += ctx.ordering_term(i).getText();
                    System.out.println(a += ctx.ordering_term(i).getText());
                } else {
                    a += a += ctx.ordering_term(i).getText() + ", ";
                    System.out.println(a += ctx.ordering_term(i).getText() + ", ");
                }
            }
        }
        if (ctx.K_LIMIT() != null) {
            a += " LIMIT " + ctx.expr(0).getText();

            if (ctx.expr(1) != null) {
                if (ctx.K_OFFSET() != null) {
                    a += " OFFSET ";
                } else {
                    a += ", ";
                }
                a += ctx.expr(1).getText();
            }
        }
        traduccion += a;
        System.out.println(a);
        super.exitCompound_select_stmt(ctx);
    }

    @Override
    public void enterInsert_stmt(SqliteParser.Insert_stmtContext ctx){
        String a = "";
        if (ctx.with_clause() != null) {
            a += ctx.with_clause().getText();
        }
        
        a+="INSERT";
        

        a+=" INTO ";
        traduccion += a;
        System.out.println(a);
        super.enterInsert_stmt(ctx);
    }

    @Override
    public void exitInsert_stmt(SqliteParser.Insert_stmtContext ctx){
        String a = "";
        if(ctx.column_name()!=null) {
            a += ctx.getText().substring(ctx.getText().indexOf("("), ctx.getText().toUpperCase().indexOf("VALUES"));
        }
        if(ctx.K_DEFAULT()!=null){
            a+=" DEFAULT VALUES";
        }else if (ctx.select_stmt()!=null){
            a+=ctx.select_stmt().getText();
        }else {
            a += " VALUES " + ctx.getText().substring(ctx.getText().toUpperCase().indexOf("VALUES") + 6);
        }
        a+=";\n";
        traduccion += a;
        System.out.println(a);
        super.exitInsert_stmt(ctx);

    }

    @Override
    public void enterSelect_or_values(SqliteParser.Select_or_valuesContext ctx) {
        if (ctx.K_SELECT() != null) {
            String a = "SELECT ";
            if (ctx.K_DISTINCT() != null) {
                a += "DISTINCT";
            } else if (ctx.K_ALL() != null) {
                a += "ALL";
            }
            if (ctx.result_column() != null) {
                for (int i = 0; i < ctx.result_column().size(); i++) {
                    if (i == (ctx.result_column().size() - 1)) {
                        a += ctx.result_column(i).getText();
                        System.out.println(ctx.result_column(i).getText());
                    } else {
                        a += ctx.result_column(i).getText() + ", ";
                        System.out.println(ctx.result_column(i).getText() + ", ");
                    }
                }
            }
            if (ctx.K_FROM() != null) {
                a += " FROM";
                if (ctx.table_or_subquery() != null) {
                    for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                        if (i == (ctx.table_or_subquery().size() - 1)) {
                            a += ctx.table_or_subquery(i).getText();
                            System.out.println(ctx.table_or_subquery(i).getText());
                        } else {
                            a += ctx.table_or_subquery(i).getText() + ", ";
                            System.out.println(ctx.table_or_subquery(i).getText() + ", ");
                        }
                    }
                } else if (ctx.join_clause() != null) {
                    a += ctx.join_clause().getText();
                }
            }
            if (ctx.K_WHERE() != null) {
                a += " WHERE" + ctx.expr(0).getText();
            }
            if (ctx.K_GROUP() != null) {
                a += " GROUP BY ";
                for (int i = 0; i < ctx.expr().size(); i++) {
                    if (i == (ctx.expr().size() - 1)) {
                        a += ctx.expr(i).getText();
                        System.out.println(ctx.expr(i).getText());
                    } else {
                        a += ctx.expr(i).getText() + ", ";
                        System.out.println(ctx.expr(i).getText() + ", ");
                    }
                }
                if (ctx.K_HAVING() != null) {
                    a += " HAVING" + ctx.expr(0);
                }
            }
            traduccion += a;
            System.out.println(a);
        } else if (ctx.K_VALUES() != null) {
            String a = "VALUES (";
            for (int i = 0; i < ctx.expr().size(); i++) {
                if (i == (ctx.expr().size() - 1)) {
                    a += ctx.expr(i).getText();
                    System.out.println(ctx.expr(i).getText());
                } else {
                    a += ctx.expr(i).getText() + ", ";
                    System.out.println(ctx.expr(i).getText() + ", ");
                }
            }
            a += ")";
            traduccion += a;
            System.out.println(a);
        }

        super.enterSelect_or_values(ctx);
    }

    @Override
    public void enterSelect_core(SqliteParser.Select_coreContext ctx) {

        if (ctx.K_SELECT() != null) {
            String a = "SELECT ";
            if (ctx.K_DISTINCT() != null) {
                a += "DISTINCT";
            } else if (ctx.K_ALL() != null) {
                a += "ALL";
            }
            if (ctx.result_column() != null) {
                for (int i = 0; i < ctx.result_column().size(); i++) {
                    if (i == (ctx.result_column().size() - 1)) {
                        a += ctx.result_column(i).getText();
                        System.out.println(ctx.result_column(i).getText());
                    } else {
                        a += ctx.result_column(i).getText() + ", ";
                        System.out.println(ctx.result_column(i).getText() + ", ");
                    }

                }
            }
            if (ctx.K_FROM() != null) {
                a += " FROM ";
                if (ctx.table_or_subquery() != null) {
                    for (int i = 0; i < ctx.table_or_subquery().size(); i++) {
                        if (i == (ctx.table_or_subquery().size() - 1)) {
                            a += ctx.table_or_subquery(i).getText();
                            System.out.println(ctx.table_or_subquery(i).getText());
                        } else {
                            a += ctx.table_or_subquery(i).getText() + ", ";
                            System.out.println(ctx.table_or_subquery(i).getText() + ", ");
                        }
                    }
                } else if (ctx.join_clause() != null) {
                    a += ctx.join_clause().getText();
                }
            }
            if (ctx.K_WHERE() != null) {
                a += " WHERE ";
                a = exprSelect(ctx, a);
            }
            if (ctx.K_GROUP() != null) {
                a += " GROUP BY ";
                a = exprSelect(ctx, a);
                if (ctx.K_HAVING() != null) {
                    a += " HAVING ";
                    a = exprSelect(ctx, a);
                }

            }
            traduccion += a;
            System.out.println(a);
        } else if (ctx.K_VALUES() != null) {
            String a = "VALUES (";
            a = exprSelect(ctx, a);
            a += ")";
            traduccion += a;
            System.out.println(a);
        }


        super.enterSelect_core(ctx);
    }

    @Override
    public void exitSelect_core(SqliteParser.Select_coreContext ctx) {
        String a ="";
        if(ctx.getParent().getText().toLowerCase().contains("union") || ctx.getParent().getText().toLowerCase().contains("unionall")||ctx.getParent().getText().toLowerCase().contains("except") ||ctx.getParent().getText().toLowerCase().contains("intersect")){
            int nextOperator = 0;
            for(int i = 0; i < ctx.getParent().getChildCount(); i++){
                if(ctx.getParent().getChild(i).getText().equals(ctx.getText())){
                    nextOperator = i+1;
                    break;
                }
            }
            System.out.println("expresion actual " + ctx.getText() + " operado: " + nextOperator + " de: " +ctx.getParent().getChildCount());
            if(nextOperator < ctx.getParent().getChildCount()){
                a += " " + ctx.getParent().getChild(nextOperator).getText().toUpperCase() + " ";
            }else{
                a += ";\n";
            }
        }else {
            a += ";\n";
        }
        traduccion += a;
        //System.out.println(a);
        super.enterSelect_core(ctx);
    }

    private String exprSelect(SqliteParser.Select_coreContext ctx, String a) {
        for (int i = 0; i < ctx.expr().size(); i++) {
            if (i == (ctx.expr().size() - 1)) {
                a += ctx.expr(i).getText();
                System.out.println(ctx.expr(i).getText());
            } else {
                a += ctx.expr(i).getText() + ", ";
                System.out.println(ctx.expr(i).getText() + ", ");
            }
        }
        a = a.replace("main.", "public.");
        a = a.replaceAll("raise\\((abort|rollback|fail),\\\"(\\\\.|[^\"\\\\])*\\\"\\)", "RAISE USING MESSAGE=\"fatal error\"");
        return a;
    }

    /*@Override
    public void enterResult_column(SqliteParser.Result_columnContext ctx) {
        String a = "";
        if (ctx.table_name() != null) {
            a += ctx.table_name().getText() + "." + "*";
        } else if (ctx.expr() != null) {

        } else {
            a += "*";
        }
        traduccion += a;
        System.out.println(a);
        super.enterResult_column(ctx);
    }*/

    @Override
    public void enterVacuum_stmt(SqliteParser.Vacuum_stmtContext ctx) {
        String a = "VACUUM;\n";

        System.out.print(a);
        traduccion += a;
        super.enterVacuum_stmt(ctx);
    }

    @Override
    public void enterIndexed_column(SqliteParser.Indexed_columnContext ctx) {
        String a = ctx.column_name().getText();
        if (ctx.K_COLLATE() != null) {
            a += " COLLATE " + ctx.collation_name().getText();
        }
        if (ctx.K_ASC() != null) {
            a += " ASC";
        } else if (ctx.K_DESC() != null) {
            a += " DESC";
        }
        if(!ctx.getParent().getChild(ctx.getParent().getChildCount()-2).getText().equals(ctx.getText())){
            a += ", ";
        }

        System.out.print(a);
        traduccion += a;
        super.enterIndexed_column(ctx);
    }

    @Override

    public void enterExpr(SqliteParser.ExprContext ctx) {
        String a = "";
        if (ctx.getParent().start.getText().toLowerCase().equals("attach")) {
            a = "";
        }
        System.out.println(a);
        traduccion += a;
        super.enterExpr(ctx);
    }


    @Override
    public void enterRaise_function(SqliteParser.Raise_functionContext ctx) {
        String a = ctx.start.getText();
        if (ctx.getChildCount() < 6) {
            a = ""; //no se hace traducción puesto que no tiene equivalente en postgres
        } else {
            a += " EXCEPTION USING MESSAGE =";
        }
        System.out.println(a);
        traduccion += a;
        super.enterRaise_function(ctx);
    }

    @Override
    public void enterDatabase_name(SqliteParser.Database_nameContext ctx) {
        String a = "";
        if (!ctx.getParent().getText().contains(".") && ctx.getParent().getText().substring(0, 7).toLowerCase().equals("analyze")) {
            for (String db : databases) {
                System.out.println("db: " + db);
            }
            if (databases.contains(ctx.getText().toLowerCase())) {
                a = ";\n";
            }else {
                a = " " + ctx.getText() + ";\n";
            }
        } else if (!ctx.getParent().getText().contains(".")) {
            if (ctx.getParent().getText().substring(0, 6).toLowerCase().equals("detach"))
                databases.remove(ctx.getText().toLowerCase());
            else
                databases.add(ctx.getText().toLowerCase());

            if (ctx.getText().toLowerCase().equals("main")) {
                a = " public;\n";
            } else {
                a = " " + ctx.getText() + ";\n";
            }
        } else if (ctx.getParent().getText().contains(".")) {
            if (ctx.getParent().getText().substring(0, 7).toLowerCase().equals("reindex")) {
                if (indexes.contains(ctx.getParent().stop.getText())) {
                    a = " INDEX";
                } else {
                    a = " TABLE";
                }
            }
            if (ctx.getText().toLowerCase().equals("main")) {
                a += " public.";
            } else {
                a += " " + ctx.getText() + ".";
            }
        }

        System.out.print(a);
        if (!ctx.getParent().getText().toUpperCase().contains("ALTER")&&!ctx.getParent().getParent().getText().toUpperCase().contains("UPDATE")&&!ctx.getParent().getParent().getText().toUpperCase().contains("CREATE")&&!(ctx.getParent().getRuleIndex() == SqliteParser.RULE_expr)){
            traduccion += a;
        }
        super.enterDatabase_name(ctx);
    }

    /*@Override
    public void exitDatabase_name(SqliteParser.Database_nameContext ctx) {
        String a = ctx.getParent().getText();
        System.out.println(a);
        traduccion += a;
        escribirTraduccion(file);
        super.exitDatabase_name(ctx);
    }*/

    @Override
    public void enterTable_name(SqliteParser.Table_nameContext ctx) {
        String a = ctx.start.getText();
        if (!ctx.getParent().getText().contains(".")) {
            a = " " + ctx.start.getText();
        }
        System.out.println(a);

        if (!ctx.getParent().getText().toUpperCase().contains("ALTER")&&!ctx.getParent().getParent().getText().toUpperCase().contains("UPDATE")&&!ctx.getParent().getParent().getText().toUpperCase().contains("SELECT")&&!ctx.getParent().getParent().getText().toUpperCase().contains("CREATE")&&!(ctx.getParent().getRuleIndex() == SqliteParser.RULE_expr)){

            traduccion += a;
        }
        super.enterTable_name(ctx);
    }

    @Override
    public void enterTable_or_index_name(SqliteParser.Table_or_index_nameContext ctx) {
        String a = ctx.getText() + ";\n";
        System.out.println(a + " tabla");
        traduccion += a;
        super.enterTable_or_index_name(ctx);
    }

    @Override
    public void enterIndex_name(SqliteParser.Index_nameContext ctx) {
        String a = ctx.start.getText();
        if (!ctx.getParent().getText().contains(".")) {
            a = " " + ctx.start.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterIndex_name(ctx);
    }

    @Override
    public void enterTrigger_name(SqliteParser.Trigger_nameContext ctx) {
        String a = ctx.start.getText();
        if (!ctx.getParent().getText().contains(".")) {
            a = " " + ctx.start.getText();
        }
        if(!ctx.getParent().getParent().getText().toUpperCase().contains("CREATE")) {
            System.out.println(a);
            traduccion += a;
        }
        super.enterTrigger_name(ctx);
    }

    /*@Override
    public void enterColumn_name(SqliteParser.Column_nameContext ctx) {
        String a = " " + ctx.getText();
        if (ctx.getParent().getText().contains(".")) {
            a = "." + ctx.getText();
        }
        System.out.println(a);
        if (!ctx.getParent().getParent().getText().toUpperCase().contains("ALTER")){
            traduccion += a;
        }
        super.enterColumn_name(ctx);
    }*/

    @Override
    public void enterView_name(SqliteParser.View_nameContext ctx) {
        String a = ctx.start.getText();
        if (!ctx.getParent().getText().contains(".")) {
            a = " " + ctx.start.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterView_name(ctx);
    }

    @Override
    public void enterSavepoint_name(SqliteParser.Savepoint_nameContext ctx) {
        String a = " " + ctx.getText() + ";\n";

        if ((ctx.getParent().getChildCount() == 3 && ctx.getParent().getChild(1).getText().toLowerCase().equals("to")) || (ctx.getParent().getChildCount() == 4 && ctx.getParent().getChild(2).getText().toLowerCase().equals("to"))) {
            a = ctx.getText() + ";\n";
        }

        System.out.print(a);
        traduccion += a;
        super.enterSavepoint_name(ctx);
    }


    /*@Override
    public void enterSigned_number(SqliteParser.Signed_numberContext ctx) {
        String a = " " + ctx.getText();
        System.out.println(a);
        if (!ctx.getParent().getParent().getParent().getText().toUpperCase().contains("ALTER")){
            traduccion += a;
        }
        super.enterSigned_number(ctx);
    }*/

    /*@Override
    public void enterLiteral_value(SqliteParser.Literal_valueContext ctx) {
        String a = " " + ctx.getText();
        System.out.println(a);
        traduccion += a;
        super.enterLiteral_value(ctx);
    }*/

    @Override
    public void enterUnary_operator(SqliteParser.Unary_operatorContext ctx) {
        String a = " " + ctx.getText();
        System.out.print(a);
        traduccion += a;
        super.enterUnary_operator(ctx);
    }

    @Override
    public void enterError_message(SqliteParser.Error_messageContext ctx) {
        String a = " " + ctx.getText() + ";\n";
        System.out.print(a);
        traduccion += a;
        super.enterError_message(ctx);
    }

    @Override
    public void enterColumn_alias(SqliteParser.Column_aliasContext ctx) {
        String a = " " + ctx.getText();
        System.out.print(a);
        traduccion += a;
        super.enterColumn_alias(ctx);
    }
}
