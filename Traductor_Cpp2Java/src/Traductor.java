import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;

import static java.lang.System.in;

public class Traductor {

    // La cadena "traduccion" será modificada cuando el walker termine de recorrrer el árbol sintáctico.
    // Ver método exitTranslationunit en el Listener
    public static String header = "";
    public static String traduccion = "";
    public static CharStream input;

    public static void main(String[] args) throws IOException {
        String file = "output.txt";

        // Declaración del Analizador Léxico de C++
        cppLexer lexer;
        // Lectura de entrada por archivo/consola
        if (args.length > 0) {
            input = CharStreams.fromFileName(args[0]);
        } else {
            input = CharStreams.fromStream(in);
        }
        lexer = new cppLexer(input);
        // Flujo de tokens que genera la entrada
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Instanciamos un analizador sintáctico con esa entrada
        cppParser parser = new cppParser(tokens);

        // Llamamos al método de la regla inicial de la gramática de C++ para hacer
        // el análisis sintáctico de la entrada: translationunit
        ParseTree tree = parser.translationunit();
        // Creamos un "recorredor/walker" del árbol sintáctico para disparar los callback del listener
        ParseTreeWalker walker = new ParseTreeWalker();
        //Visitor visitor = new Visitor();

        // Informamos al Listener cuál será el archivo de salida
        //Listener.file = file;
        // Recorremos el árbol para generar la traducción
        //visitor.visit(tree);
        walker.walk(new Listener(), tree);
        escribirTraduccion(file);
    }

    private static void escribirTraduccion(String file) {
        String str = "";
        str = "program output;"+System.lineSeparator()+header + System.lineSeparator() + traduccion ;
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
}
