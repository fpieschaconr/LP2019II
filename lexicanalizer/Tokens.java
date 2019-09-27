package lexicanalizer;

import java.io.*;

class Tokens {

    static void clearOutput() throws FileNotFoundException {
        new PrintWriter("out.txt").close();
    }

    static void writeToken(String token) {
        try (FileWriter fw = new FileWriter(new File("out.txt").getAbsoluteFile(), true)) {
            fw.write(token);
            fw.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
