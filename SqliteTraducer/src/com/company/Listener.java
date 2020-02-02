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

    private static void escribirTraduccion(String file) {
        String str = "";
        str = "-- Generated postgreSQL file from SQLite\n-- Final ANTLRv4 Project LP 2019-II\n-- By Tom Erick Perez, Felipe Pieschacon and Juan Nicolas Nobza\n\n" + System.lineSeparator() + traduccion;
        crearArchivo(file, str);
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
        escribirTraduccion(file);
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
            a += ctx.column_def().getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterAlter_table_stmt(ctx);
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
        if(ctx.K_UNION() != null){
            a += "UNION";
        }else if(ctx.K_ALL() != null){
            a += "UNION ALL";
        }else if(ctx.K_INTERSECT() != null){
            a += "INTERSECT";
        }else if(ctx.K_EXCEPT() != null){
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
        a += " INDEX";
        if (ctx.K_IF() != null) {
            a += " IF NOT EXISTS";
        }
        if (ctx.database_name() != null) {
            a += ctx.database_name().getText() + ".";
        }
        a += ctx.index_name().getText() + " ON" + ctx.table_name().getText() + " (";
        for (int i = 0; i < ctx.indexed_column().size(); i++) {
            if (i == (ctx.indexed_column().size() - 1)) {
                a += ctx.indexed_column(i).getText();
                System.out.println(ctx.indexed_column(i).getText());
            } else {
                a += ctx.indexed_column(i).getText() + ", ";
                System.out.println(ctx.indexed_column(i).getText() + ", ");
            }
        }
        a += ")";
        if (ctx.K_WHERE() != null) {
            a += " WHERE" + ctx.expr().getText();
        }
        traduccion += a;
        System.out.println(a);
        super.enterCreate_index_stmt(ctx);
    }

    @Override
    public void exitCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx) {
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
        a += " TABLE";
        if (ctx.K_IF() != null) {
            a += " IF NOT EXISTS";
        }
        if (ctx.database_name() != null) {
            a += ctx.database_name().getText() + ".";
        }
        a += ctx.table_name().getText();
        if (ctx.column_def() != null) {
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
        } else if (ctx.K_AS() != null) {
            a += " AS ";
        }
        traduccion += a;
        System.out.println(a);
        super.enterCreate_table_stmt(ctx);
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
                traduccion += a;
                System.out.println(a);
            }
        } else if (ctx.K_VALUES() != null) {
            String a = "VALUES (";
            a = exprSelect(ctx, a);
            a += ")";
            traduccion += a;
            System.out.println(a);
        }


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
        return a;
    }

    @Override
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
    }

    @Override
    public void enterVacuum_stmt(SqliteParser.Vacuum_stmtContext ctx) {
        String a = "VACUUM;\n";
        System.out.print(a);
        traduccion += a;
        super.enterVacuum_stmt(ctx);
    }

    @Override
    public void enterIndexed_column(SqliteParser.Indexed_columnContext ctx) {
        String a = ctx.start.getText();
        if (ctx.getChildCount() >= 3) {
            a += " COLLATE";
        }
        System.out.print(a);
        traduccion += a;
        super.enterIndexed_column(ctx);
    }

    @Override
    public void exitIndexed_column(SqliteParser.Indexed_columnContext ctx) {
        String a = "";

        if (ctx.getChildCount() == 4 || ctx.getChildCount() == 2) {
            a = " " + ctx.stop.getText();
        }
        if (ctx.getParent().getChild(ctx.getParent().getChildCount() - 2).getText().equals(ctx.getText())) {
            a += ");\n";
        } else {
            a += ", ";
        }
        System.out.print(a);
        traduccion += a;
        super.exitIndexed_column(ctx);
    }

    @Override
    public void enterCollation_name(SqliteParser.Collation_nameContext ctx) {
        String a = " " + ctx.start.getText();
        if (ctx.getParent().getText().toLowerCase().contains("reindex")) {
            if (collations[0].equals(ctx.getText()) || collations[1].equals(ctx.getText()) || collations[2].equals(ctx.getText())) {
                a = " DATABASE public;\n";
            } else if (indexes.contains(ctx.getText())) {
                a = " INDEX " + ctx.getText() + ";\n";
            } else {
                a = " TABLE " + ctx.getText() + ";\n";
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterCollation_name(ctx);
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
            } else {
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
        traduccion += a;
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
        traduccion += a;
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
        System.out.println(a);
        traduccion += a;
        super.enterTrigger_name(ctx);
    }

    @Override
    public void enterColumn_name(SqliteParser.Column_nameContext ctx) {
        String a = " " + ctx.getText();
        if (ctx.getParent().getText().contains(".")) {
            a = "." + ctx.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterColumn_name(ctx);
    }

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


    @Override
    public void enterSigned_number(SqliteParser.Signed_numberContext ctx) {
        String a = " " + ctx.getText();
        System.out.println(a);
        traduccion += a;
        super.enterSigned_number(ctx);
    }

    @Override
    public void enterLiteral_value(SqliteParser.Literal_valueContext ctx) {
        String a = " " + ctx.getText();
        System.out.println(a);
        traduccion += a;
        super.enterLiteral_value(ctx);
    }

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
