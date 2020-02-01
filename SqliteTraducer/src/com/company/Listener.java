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

    private static void escribirTraduccion(String file) {
        //los esquemas default que tiene SQLite
        databases.add("main");
        databases.add("temp");
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
    public void exitParse(SqliteParser.ParseContext ctx) {
        String a = ctx.getText();
        escribirTraduccion(file);
        super.enterParse(ctx);
    }

    @Override
    public void enterAnalyze_stmt(SqliteParser.Analyze_stmtContext ctx) {
        String a = "ANALYZE VERBOSE";
        System.out.print(a);
        traduccion += a;
        escribirTraduccion(file);
        super.enterAnalyze_stmt(ctx);
    }

    @Override
    public void enterAttach_stmt(SqliteParser.Attach_stmtContext ctx) {
        String a = "CREATE SCHEMA";
        System.out.print(a);
        traduccion += a;
        escribirTraduccion(file);
        super.enterAttach_stmt(ctx);
    }

    /*@Override
    public void exitAttach_stmt(SqliteParser.Attach_stmtContext ctx) {
        databases.add(ctx.stop.getText());
        String a = " " + ctx.stop.getText() + ";\n";
        System.out.print(a);
        traduccion += a;
        escribirTraduccion(file);
        super.exitAttach_stmt(ctx);
    }*/

    @Override
    public void enterDetach_stmt(SqliteParser.Detach_stmtContext ctx) {
        String a = "DROP SCHEMA";
        System.out.print(a);
        traduccion += a;
        escribirTraduccion(file);
        super.enterDetach_stmt(ctx);
    }

    /*@Override
    public void exitDetach_stmt(SqliteParser.Detach_stmtContext ctx) {
        databases.remove(ctx.stop.getText());
        String a = " " + ctx.stop.getText() + ";\n";
        System.out.print(a);
        traduccion += a;
        escribirTraduccion(file);
        super.exitDetach_stmt(ctx);
    }*/

    @Override
    public void enterExpr(SqliteParser.ExprContext ctx) {
        String a = ctx.start.getText();
        if(ctx.getParent().getText().substring(0,14).toLowerCase().equals("attachdatabase") || ctx.getParent().getText().substring(0,6).toLowerCase().equals("attach")){
            a="";
        }
        System.out.println(a);
        traduccion += a;
        escribirTraduccion(file);
        super.enterExpr(ctx);
    }

    @Override
    public void enterDatabase_name(SqliteParser.Database_nameContext ctx) {
        String a = "";
        if(!ctx.getParent().getText().contains(".") && ctx.getParent().getText().substring(0, 7).toLowerCase().equals("analyze")){
            if(databases.contains(ctx.getText().toLowerCase())){
                a = "\n";
            }else{
                a = " " + ctx.getText() + ";\n";
            }
        }else if(!ctx.getParent().getText().contains(".")){
            if(ctx.getParent().getText().substring(0, 6).toLowerCase().equals("detach"))
                databases.remove(ctx.getText().toLowerCase());
            else
                databases.add(ctx.getText().toLowerCase());

            a = " " + ctx.getText() + ";\n";
        }else if(ctx.getParent().getText().contains(".")){
            a = " " + ctx.getText() + ".";
        }
        System.out.print(a);
        traduccion += a;
        escribirTraduccion(file);
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
    public void enterTable_or_index_name(SqliteParser.Table_or_index_nameContext ctx) {
        String a = ctx.getText() + ";\n";
        System.out.println(a+" tabla");
        traduccion += a;
        escribirTraduccion(file);
        super.enterTable_or_index_name(ctx);
    }
}
