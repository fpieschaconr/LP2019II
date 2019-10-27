/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author maria
 */
class Tokens {
    private List<String> RESERVED; //palabras reservadas lenguaje SR
    private List<String> TOKENS; //tokens de simbolos generales lenguaje SR

    Tokens() throws IOException {
        File file = new File("RESERVED.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        //noinspection ResultOfMethodCallIgnored
        fis.read(data);
        fis.close();
        String str = new String(data, StandardCharsets.UTF_8);
        this.RESERVED = Arrays.asList(str.split("##"));

        file = new File("TOKENS.txt");
        fis = new FileInputStream(file);
        data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();
        str = new String(data, StandardCharsets.UTF_8);
        this.TOKENS = Arrays.asList(str.split("##"));
    }

    void clearOutput() throws FileNotFoundException //limpia el out.txt
    {
        new PrintWriter("out.txt").close();
    }

    private void writeToken(String token) {
        try (FileWriter fw = new FileWriter(new File("out.txt").getAbsoluteFile(), true)) //escribe en out.txt sin alterar lo anterior, pasa a siguiente linea
        {
            fw.write(token);
            fw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    boolean tokenize (String value, int row, int column) { //genera el token correspondiente al valor dado
        if (value.equals("")||value.matches("\\s*")) return false;
        row++;
        int col = column;
        String temp;
        
        if (RESERVED.contains(value)) {
            temp = "<" + value + "," + row + "," + col + ">";
            LexicAnalizer.addToken("tk_"+value);
            writeToken(temp);
        } else {
            for (String token : TOKENS) {
                String[] temp2 = token.split("#;#");
                if (value.matches(temp2[0])) {
                    if (temp2[1].equals("tk_num") || temp2[1].equals("tk_cadena")|| temp2[1].equals("tk_caracter")) {
                        temp = "<" + temp2[1] + "," + value + "," + row + "," + col + ">";
                        writeToken(temp);
                    } else {
                        temp = "<" + temp2[1] + "," + row + "," + col + ">";
                        writeToken(temp);
                    }
                    LexicAnalizer.addToken(temp2[1]);
                    return false;
                }
            }
            if (value.matches("^[a-zA-Z][\\w_\\d]*$")) {
                    temp = "<id," + value + "," + row + "," + col + ">";
                    LexicAnalizer.addToken("tk_id");
                    writeToken(temp);
                    return false;
            }
            temp = ">>> Error lexico(linea:" + row + ",posicion:" + col + ")";
            writeToken(temp);
            return true;
        }
        return false;
    }
}
