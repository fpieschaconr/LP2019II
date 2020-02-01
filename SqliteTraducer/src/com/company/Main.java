package com.company;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            SqliteLexer lexer;
            if (args.length>0)
                lexer = new SqliteLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new SqliteLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            SqliteParser parser = new SqliteParser(tokens);

            // Specify our entry point
            ParseTree tree = parser.parse();

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            Listener listener = new Listener();
            walker.walk(listener, tree);
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}

