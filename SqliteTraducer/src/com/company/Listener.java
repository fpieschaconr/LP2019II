package com.company;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Listener extends SqliteBaseListener {

    private static String traduccion = "";
    private static String file = "output.txt";
    //en esta variable se van a guardar los esquemas de la base de datos puesto que la gramtaica no distingue tablas y esquemas
    private static ArrayList<String> databases = new ArrayList<>();
    private static ArrayList<String> tables = new ArrayList<>();
    private static ArrayList<String> indexes = new ArrayList<>();
    //en esta se guardan los tres tipos de collation de sqlite
    private static final String[] collations={"binary", "rtrim", "nocase"};

    private static void escribirTraduccion(String file) {
        String str = "";
        str = "-- Generated postgreSQL file from SQLite\n-- Final ANTLRv4 Project LP 2019-II\n-- By Tom Erick Perez, Felipe Pieschacon and Juan Nicolas Nobza\n\n"+ System.lineSeparator() + traduccion ;
        crearArchivo(file,str);
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
        if(ctx.getText().toLowerCase().contains("transaction")) {
            a += " TRANSACTION;\n";
        }else{
                a += ";\n";
        }
        System.out.print(a);
        traduccion += a;
        super.enterBegin_stmt(ctx);
    }

    @Override
    public void enterCommit_stmt(SqliteParser.Commit_stmtContext ctx) {
        String a = "";
        if(ctx.getChild(0).getText().toLowerCase().equals("commit")){
            a = "COMMIT";
        }else{
            a = "END";
        }

        if(ctx.getText().toLowerCase().contains("transaction")) {
            a += " TRANSACTION;\n";
        }else{
            a += ";\n";
        }
        System.out.print(a);
        traduccion += a;
        super.enterCommit_stmt(ctx);
    }

    @Override
    public void exitCreate_index_stmt(SqliteParser.Create_index_stmtContext ctx) {
        indexes.add(ctx.index_name().getText());
        super.exitCreate_index_stmt(ctx);
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
        if(ctx.getChildCount()>=4){
            if(ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")){
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
        if(ctx.getChildCount()>=4){
            if(ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")){
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
        if(ctx.getChildCount()>=4){
            if(ctx.getChild(2).getText().toLowerCase().equals("if") && ctx.getChild(3).getText().toLowerCase().equals("exists")){
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
        if(ctx.getChildCount()==1){
            a += " DATABASE public;\n";
            for(String db: databases){
                if(!db.equals("main")){
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
        if(ctx.getChildCount()>2)
            a = ";\n";
        System.out.print(a);
        traduccion += a;
        super.exitReindex_stmt(ctx);
    }

    @Override
    public void enterRelease_stmt(SqliteParser.Release_stmtContext ctx) {
        String a = "RELEASE";
        if(ctx.getText().toLowerCase().contains("savepoint")){
            a += " SAVEPOINT";
        }
        System.out.print(a);
        traduccion += a;
        super.enterRelease_stmt(ctx);
    }

    @Override
    public void enterRollback_stmt(SqliteParser.Rollback_stmtContext ctx) {
        String a = "ROLLBACK";
        if(ctx.getText().toLowerCase().contains("transaction")){
            a += " TRANSACTION";
        }

        if(ctx.getText().toLowerCase().contains("to")){
            a += " TO ";
        }else{
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
    public void enterIndexed_column(SqliteParser.Indexed_columnContext ctx) {
        String a = ctx.start.getText();
        if(ctx.getChildCount() >= 3){
            a += " COLLATE";
        }
        System.out.print(a);
        traduccion += a;
        super.enterIndexed_column(ctx);
    }

    @Override
    public void exitIndexed_column(SqliteParser.Indexed_columnContext ctx) {
        String a = "";

        if(ctx.getChildCount() == 4 || ctx.getChildCount() == 2){
            a = " " + ctx.stop.getText();
        }
        if(ctx.getParent().getChild(ctx.getParent().getChildCount()-2).getText().equals(ctx.getText())){
            a += ");\n";
        }else{
            a += ", ";
        }
        System.out.print(a);
        traduccion += a;
        super.exitIndexed_column(ctx);
    }

    @Override
    public void enterCollation_name(SqliteParser.Collation_nameContext ctx) {
        String a = " " + ctx.start.getText();
        if(ctx.getParent().getText().toLowerCase().contains("reindex")){
            if(collations[0].equals(ctx.getText()) || collations[1].equals(ctx.getText()) || collations[2].equals(ctx.getText())){
                a=" DATABASE public;\n";
            }else if(indexes.contains(ctx.getText())){
                a=" INDEX " + ctx.getText() + ";\n";
            }else{
                a=" TABLE " + ctx.getText() + ";\n";
            }
        }
        System.out.print(a);
        traduccion += a;
        super.enterCollation_name(ctx);
    }

    @Override
    public void enterExpr(SqliteParser.ExprContext ctx) {
        String a = ctx.start.getText();
        if(ctx.getParent().getText().substring(0,14).toLowerCase().equals("attachdatabase") || ctx.getParent().getText().substring(0,6).toLowerCase().equals("attach")){
            a="";
        }
        System.out.println(a);
        traduccion += a;
        super.enterExpr(ctx);
    }

    @Override
    public void enterDatabase_name(SqliteParser.Database_nameContext ctx) {
        String a = "";
        if(!ctx.getParent().getText().contains(".") && ctx.getParent().getText().substring(0, 7).toLowerCase().equals("analyze")){
            for(String db:databases){
                System.out.println("db: " + db);
            }
            if(databases.contains(ctx.getText().toLowerCase())){
                a = ";\n";
            }else{
                a = " " + ctx.getText() + ";\n";
            }
        }else if(!ctx.getParent().getText().contains(".")){
            if(ctx.getParent().getText().substring(0, 6).toLowerCase().equals("detach"))
                databases.remove(ctx.getText().toLowerCase());
            else
                databases.add(ctx.getText().toLowerCase());

            if(ctx.getText().toLowerCase().equals("main")){
                a = " public;\n";
            }else{
                a = " " + ctx.getText() + ";\n";
            }
        }else if(ctx.getParent().getText().contains(".")){
            if(ctx.getParent().getText().substring(0, 7).toLowerCase().equals("reindex")){
                if(indexes.contains(ctx.getParent().stop.getText())){
                    a=" INDEX";
                }else{
                    a=" TABLE";
                }
            }
            if(ctx.getText().toLowerCase().equals("main")){
                a += " public.";
            }else{
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
        if(!ctx.getParent().getText().contains(".")){
            a = " " + ctx.start.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterTable_name(ctx);
    }

    @Override
    public void enterTable_or_index_name(SqliteParser.Table_or_index_nameContext ctx) {
        String a = ctx.getText() + ";\n";
        System.out.println(a+" tabla");
        traduccion += a;
        super.enterTable_or_index_name(ctx);
    }

    @Override
    public void enterIndex_name(SqliteParser.Index_nameContext ctx) {
        String a = ctx.start.getText();
        if(!ctx.getParent().getText().contains(".")){
            a = " " + ctx.start.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterIndex_name(ctx);
    }

    @Override
    public void enterTrigger_name(SqliteParser.Trigger_nameContext ctx) {
        String a = ctx.start.getText();
        if(!ctx.getParent().getText().contains(".")){
            a = " " + ctx.start.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterTrigger_name(ctx);
    }

    @Override
    public void enterView_name(SqliteParser.View_nameContext ctx) {
        String a = ctx.start.getText();
        if(!ctx.getParent().getText().contains(".")){
            a = " " + ctx.start.getText();
        }
        System.out.println(a);
        traduccion += a;
        super.enterView_name(ctx);
    }

    @Override
    public void enterSavepoint_name(SqliteParser.Savepoint_nameContext ctx)  {
        String a = " " + ctx.getText() + ";\n";

        if((ctx.getParent().getChildCount() == 3 && ctx.getParent().getChild(1).getText().toLowerCase().equals("to")) || (ctx.getParent().getChildCount() == 4 && ctx.getParent().getChild(2).getText().toLowerCase().equals("to"))){
            a = ctx.getText() + ";\n";
        }

        System.out.print(a);
        traduccion += a;
        super.enterSavepoint_name(ctx);
    }
}
