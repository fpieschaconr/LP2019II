package LexicAnalizer.src.lexicanalizer;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.StringTokenizer;

class Tokens {

    private List<String> RESERVED; //palabras reservadas lenguaje SR
    private List<String> TOKENS; //tokens de simbolos generales lenguaje SR

    Tokens() throws IOException {
        File file = new File("LexicAnalizer/RESERVED.txt");
        this.RESERVED = Files.readAllLines(file.toPath(), Charset.defaultCharset());

        file = new File("LexicAnalizer/TOKENS.txt");
        this.TOKENS = Files.readAllLines(file.toPath(), Charset.defaultCharset());
    }

    void clearOutput() throws FileNotFoundException //limpia el out.txt
    {
        new PrintWriter("LexicAnalizer/out.txt").close();
    }

    private void writeToken(String token) {
        try (FileWriter fw = new FileWriter(new File("LexicAnalizer/out.txt").getAbsoluteFile(), true)) //escribe en out.txt sin alterar lo anterior, pasa a siguiente linea
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
            writeToken(temp);
        } else {
            for (String token : TOKENS) {
                StringTokenizer st = new StringTokenizer(token);
                String[] temp2 = new String[2];
                temp2[1]= st.nextToken();//token
                temp2[0]= st.nextToken();//regex
                if (value.matches(temp2[0])) {
                    if (temp2[1].equals("tk_num") || temp2[1].equals("tk_cadena")) {
                        temp = "<" + temp2[1] + "," + value + "," + row + "," + col + ">";
                        writeToken(temp);
                    } else {
                        temp = "<" + temp2[1] + "," + row + "," + col + ">";
                        writeToken(temp);
                    }
                    return false;
                }
            }
            if (value.matches("^[a-zA-Z][\\w_\\d]*$")) {
                    temp = "<id," + value + "," + row + "," + col + ">";
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
