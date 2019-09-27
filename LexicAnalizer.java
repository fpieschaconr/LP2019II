/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicanalizer;

import java.util.ArrayList;

/**
 *
 * @author maria
 */
public class LexicAnalizer {
    static private int position[] = { 0, 0 }; // 0: row 1:column

    static String trimEnd(String str) {
        char[] temp = str.toCharArray();
        int i = str.length() - 1;
        for (; i >= 0; i--) {
            if (temp[i] != ' ') {
                break;
            }
        }
        char[] newStr = new char[i + 1];
        for (int j = 0; j <= i; j++)
            newStr[j] = temp[j];
        return new String(newStr);
    }

    static ArrayList<String> splitLines(String code) { // retorna una lista de lineas de código separada por saltos de
                                                       // linea
        ArrayList<String> temp = new ArrayList();
        String[] charArray = code.split("\\n");
        for (String a : charArray) {
            temp.add(trimEnd(a.replace("\t", "   ")));
        }
        return temp;
    }

    static boolean hasNextChar(ArrayList<String> fracCode) {
        if (position[0] < fracCode.size())
            return true;
        else
            return false;
    }

    static char nextCharacter(ArrayList<String> fracCode) {
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

    public static void main(String[] args) {
        String lastWord = ""; // almacena la última palabra revisada con fines de saber que tipo de token es
        char current;
        ArrayList<String> test = splitLines("global sizes \n\t# matrix dimension, default 10\n\tvar N := 10 "
                + "# number of processes, default 2\n\tvar PR := 2 \n"
                + "\t# strip size\n\tvar S : int \nbody sizes \n\tgetarg(1, N); getarg(2, PR); S := N/PR \n\tif N mod PR != 0 -> \n"
                + "\t\twrite(\"N must be a multiple of PR\"); stop (1) \n\tfi \nend");
        int lastRow = 0;
        while (hasNextChar(test)) {
            // System.out.println("row= " + position[0] + " column= " + position[1]);
            current = nextCharacter(test);
            // el análisis léxico se debe hacer en esta parte del código

            switch (current) {
            case '+':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case '-':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case '/':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case '*':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case '=':
                if (!("!".equals(lastWord) || "=".equals(lastWord) || ":".equals(lastWord) || ">".equals(lastWord)
                        || "<".equals(lastWord) || "+:".equals(lastWord) || "-:".equals(lastWord)
                        || "/:".equals(lastWord) || "*:".equals(lastWord))) {
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                }
                break;
            case ':':
                if (!("+".equals(lastWord) || "-".equals(lastWord) || "/".equals(lastWord) || "*".equals(lastWord))) {
                    System.out.println(lastWord);
                    lastWord = ""; // se cambia a una palabra nueva
                }
                break;
            case '!':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case ' ':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case '>':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case '<':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case ',':
                System.out.println(lastWord);
                lastWord = ""; // se cambia a una palabra nueva
                break;
            case ';':
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
