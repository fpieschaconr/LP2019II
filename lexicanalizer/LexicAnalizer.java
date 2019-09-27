package lexicanalizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

class LexicAnalizer {
    static private final int[] position = {0, 0}; // 0: row 1:column

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

    private static ArrayList<String> splitLines(String code) { // retorna una lista de lineas de código separada por saltos de
        // linea
        ArrayList<String> temp = new ArrayList<>();
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
        // char next=1;
        // if(position[0]<fracCode.size())
        char next = fracCode.get(position[0]).charAt(position[1]);
        /*
         * else{ System.out.println("fin de la cadena"); return '#'; }
         */

        if (position[1] > fracCode.get(position[0]).length() - 2) {
            position[0] = position[0] + 1;
            position[1] = 0; // pasa a la siguiente linea
        } else if (next == '#') {
            position[0] = position[0] + 1;
            position[1] = 0;
            next = fracCode.get(position[0]).charAt(position[1]); // se ignoran los comentarios
            position[1] = 1;
        } else {
            position[1] = position[1] + 1; // pasa a la siguiente columna
        }
        return next;
    }

    public static void main(String[] args) throws IOException {
        String lastWord = ""; // almacena la última palabra revisada con fines de saber que tipo de token es
        char current;

        File file = new File("in.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        String str = new String(data, StandardCharsets.UTF_8);

        ArrayList<String> test = splitLines(str);

        Tokens.clearOutput();

        int lastRow = 0;
        while (hasNextChar(test)) {
            // System.out.println("row= " + position[0] + " column= " + position[1]);
            current = nextCharacter(test);
            // el análisis léxico se debe hacer en esta parte del código

            switch (current) {
                case '+':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case '-':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case '/':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case '*':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case '=':
                    if (!("!".equals(lastWord) || "=".equals(lastWord) || ":".equals(lastWord) || ">".equals(lastWord)
                            || "<".equals(lastWord) || "+:".equals(lastWord) || "-:".equals(lastWord)
                            || "/:".equals(lastWord) || "*:".equals(lastWord))) {
                        Tokens.writeToken(lastWord);
                        System.out.println(lastWord);
                        lastWord = ""; // se cambia a una palabra nueva
                    }
                    break;
                case ':':
                    if (!("+".equals(lastWord) || "-".equals(lastWord) || "/".equals(lastWord) || "*".equals(lastWord))) {
                        Tokens.writeToken(lastWord);
                        System.out.println(lastWord);
                        lastWord = ""; // se cambia a una palabra nueva
                    }
                    break;
                case '!':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case ' ':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case '>':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case '<':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case ',':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
                case ';':
                    Tokens.writeToken(lastWord);
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                    break;
            }
            // falta agregar casos para los número o las variables en caso de que separen
            // una palabra o los casos en que sea todo parte de un string dentro del
            // programa

            if (lastRow < position[0]) {
                // System.out.println("cambio de linea"); //asi se determina un salto de linea
                lastRow = position[0];
                lastWord = ""; // se cambia a una palabra nueva
            } else if (current != ' ') {
                lastWord += current;
            }
        }
    }

}
