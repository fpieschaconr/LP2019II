package lexicanalizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

class LexicAnalizer {
    static private final int[] position = {0, 0}; //0: row 1:column
    static private final int[] last = {0, 0}; //sobre esta pocision se hacen los analisis

    private static String trimEnd(String str) {
        char[] temp = str.toCharArray();
        int i = str.length() - 1;
        for (; i >= 0; i--) {
            if (temp[i] != ' ') {
                break;
            }
        }
        char[] newStr = new char[i + 1];
        System.arraycopy(temp, 0, newStr, 0, i + 1);
        return new String(newStr);
    }

    private static ArrayList<String> splitLines(String code) { //retorna una lista de lineas de código separada por saltos de linea
        ArrayList<String> temp = new ArrayList<String>();
        String[] charArray = code.split("\\n");
        for (String a : charArray) {
            temp.add(trimEnd(a.replace("\t", "   ")));
        }
        return temp;
    }

    private static boolean hasNextChar(ArrayList<String> fracCode) {
        return position[0] < fracCode.size();
    }

    private static char nextCharacter(ArrayList<String> fracCode) {
        //char next=1;
        //if(position[0]<fracCode.size())
        last[0] = position[0];
        last[1] = position[1];
        char next = fracCode.get(position[0]).charAt(position[1]);
        /*else{
            System.out.println("fin de la cadena");
            return '#';
        }*/

        if (position[1] > fracCode.get(position[0]).length() - 2) {
            position[0] = position[0] + 1;
            position[1] = 0; //pasa a la siguiente linea
        } else if (next == '#') {
            position[0] = position[0] + 1;
            position[1] = 0;
            next = fracCode.get(position[0]).charAt(position[1]); //se ignoran los comentarios
            position[1] = 1;
        } else {
            position[1] = position[1] + 1; //pasa a la siguiente columna
        }
        return next;
    }

    public static void main(String[] args) throws IOException {
        String lastWord = ""; //almacena la última palabra revisada con fines de saber que tipo de token es
        char current;

        File file = new File("in.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        String str = new String(data, StandardCharsets.UTF_8);

        ArrayList<String> test = splitLines(str);

        Tokens tokens = new Tokens();
        tokens.clearOutput();

        while (hasNextChar(test)) {
            current = nextCharacter(test);
            //el análisis léxico se debe hacer en esta parte del código
            //if( )
            if (position[1] == 0) {
                tokens.tokenize(lastWord.trim(), last[0], last[1]);
                System.out.println(lastWord.trim());
                lastWord = ""; //se cambia a una palabra nueva
            } else if (!lastWord.contains("\"") || lastWord.matches("\"(\\w|\\W)*\"")) {
                switch (current) {
                    case '+':
                    case ')':
                    case '(':
                    case ';':
                    case ',':
                    case '<':
                    case ' ':
                    case '!':
                    case '*':
                    case '/':
                    case '-':
                        tokens.tokenize(lastWord.trim(), last[0], last[1]);
                        System.out.println(lastWord.trim());
                        lastWord = ""; //se cambia a una palabra nueva
                        break;
                    case '=':
                        if (!("!".equals(lastWord) || "=".equals(lastWord) || ":".equals(lastWord) || ">".equals(lastWord) || "<".equals(lastWord) || "+:".equals(lastWord) || "-:".equals(lastWord) || "/:".equals(lastWord) || "*:".equals(lastWord))) {
                            tokens.tokenize(lastWord.trim(), last[0], last[1]);
                            System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    case ':':
                        if (!("+".equals(lastWord) || "-".equals(lastWord) || "/".equals(lastWord) || "*".equals(lastWord))) {
                            tokens.tokenize(lastWord.trim(), last[0], last[1]);
                            System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva, tambien hay que hacer análisis en este punto
                        }
                        break;
                    case '>':
                        if (!"-".equals(lastWord)) {
                            tokens.tokenize(lastWord.trim(), last[0], last[1]);
                            System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    case '\"':
                        if (!lastWord.contains("\"")) {
                            tokens.tokenize(lastWord.trim(), last[0], last[1]);
                            System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    default:
                        if (lastWord.matches("\\(")) {
                            tokens.tokenize(lastWord.trim(), last[0], last[1]);
                            lastWord = "";
                        }
                        break;
                }
            }
            //falta agregar casos para los número o las variables en caso de que separen una palabra o los casos en que sea to do parte de un string dentro del programa
            lastWord += current;
        }
    }

}