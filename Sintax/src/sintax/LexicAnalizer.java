/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintax;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author maria
 */
class LexicAnalizer {
    static private int position[]={0,0}; //0: row 1:column
    static private int last[]={0,0}; //sobre esta pocision se hacen los analisis
    static String lastWord = "";
    static int lastR=1, lastC=1;
    static ArrayList<String> tokenList=new ArrayList<>();
    int pos=0;
    
    public LexicAnalizer() throws IOException{
        lastWord = ""; //almacena la última palabra revisada con fines de saber que tipo de token es
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
        boolean error=false;
        
        while(hasNextChar(test) && !error){
            current = nextCharacter(test);
            char[] t={current};
            String temp= new String(t);
            //el análisis léxico se debe hacer en esta parte del código
            if(position[1]==0){
                lastR=last[0];
                lastC=last[1];
                if(!hasNextChar(test)){
                    lastWord+=current;
                    lastC++;
                }
                error = tokens.tokenize(lastWord.trim(), lastR, lastC-lastWord.length()+1);
                if(!hasNextChar(test)){
                    addToken("$");
                }
                //System.out.println(lastWord.trim());
                lastWord = "";
                continue;
            }
            if(last[1]==0){
                error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                //System.out.println(lastWord.trim());
                lastWord = ""; //se cambia a una palabra nueva
            }else if(lastWord.equals(".") || lastWord.equals(",") || (lastWord.equals(":") && current != '=')){
                error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                //System.out.println(lastWord.trim());
                lastWord = ""; //se cambia a una palabra nueva
            }else if((("+".equals(lastWord.trim()) && current!='+') || ("-".equals(lastWord.trim()) && (!(temp.matches("\\d") || current!='-' || current != '>'))) || "/".equals(lastWord.trim()) || ("*".equals(lastWord.trim())&&current!='*')|| "**".equals(lastWord.trim())|| ">>".equals(lastWord.trim())|| "<<".equals(lastWord.trim())|| ("|".equals(lastWord.trim()) && current!='|')|| "||".equals(lastWord.trim())|| "&".equals(lastWord.trim())|| "%".equals(lastWord.trim())) && current != ':'){
                error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                //System.out.println(lastWord.trim());
                lastWord = ""; //se cambia a una palabra nueva
            }else if(!lastWord.contains("\"") || !lastWord.contains("\"") || lastWord.matches("\"(\\w|\\W)*\"") || lastWord.matches("\'.{1}\'")){
                switch(current){
                    case ')':
                    case '(':
                    case '[':
                    case '{':
                    case '}':
                    case ';':
                    case ',':
                    case ' ':
                    case '!':
                    case '&':
                    case '?':
                    case '@':
                    case '^':
                        error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                        //System.out.println(lastWord.trim());
                        lastWord = ""; //se cambia a una palabra nueva
                        break;
                    case '-':
                        if (!lastWord.trim().equals("-")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                        
                    case ']':
                        if (!lastWord.trim().equals("[")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                    case '/':
                        if (!lastWord.trim().equals("/")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                    case '<':
                        if (!lastWord.trim().equals("<")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                    case '>':
                        if (!("-".equals(lastWord.trim())||">".equals(lastWord.trim()))) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    case '|':
                        if (!lastWord.trim().equals("|")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                    case '*':
                        if (!lastWord.trim().equals("*")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                    case '+':
                        if (!lastWord.trim().equals("+")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = "";
                        }
                        break;
                    case '=':
                        if (!(lastWord.trim().equals("!") || lastWord.trim().equals("=") || lastWord.trim().equals(":") || lastWord.trim().equals(">") || lastWord.trim().equals("<")|| lastWord.trim().equals(">>:") || lastWord.trim().equals("<<:") || "+:".equals(lastWord.trim()) || "-:".equals(lastWord.trim()) || "/:".equals(lastWord.trim()) || "*:".equals(lastWord.trim())|| "**:".equals(lastWord.trim())|| "%:".equals(lastWord.trim())|| "|:".equals(lastWord.trim())|| "||:".equals(lastWord.trim())|| "&:".equals(lastWord.trim()))) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    case '.':
                        if (!lastWord.trim().matches("^-?\\d+$")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    case ':':
                        if (!("+".equals(lastWord.trim()) || "-".equals(lastWord.trim()) || "/".equals(lastWord.trim()) || "*".equals(lastWord.trim())|| "%".equals(lastWord.trim())|| lastWord.trim().equals(":=")|| "**".equals(lastWord.trim())|| ">>".equals(lastWord.trim())|| "<<".equals(lastWord.trim())|| "|".equals(lastWord.trim())|| "||".equals(lastWord.trim())|| "&".equals(lastWord.trim()))) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva, tambien hay que hacer análisis en este punto
                        }
                        break;
                    case '\"':
                        if (!lastWord.contains("\"")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                        
                    case '\'':
                        if (!lastWord.contains("'")) {
                            System.out.println(lastWord+" swap");
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            //System.out.println(lastWord.trim());
                            lastWord = ""; //se cambia a una palabra nueva
                        }
                        break;
                    default:
                        if (lastWord.trim().matches("\\(")||lastWord.trim().matches("\\[")) {
                            error = tokens.tokenize(lastWord.trim(), lastR, lastC);
                            lastWord = "";
                        }
                        break;
                }
            //falta agregar casos para los número o las variables en caso de que separen una palabra o los casos en que sea todo parte de un string dentro del programa
        }
            if(current!=' '){
                if(lastWord.equals("")){
                    lastR=last[0];
                    lastC=last[1]+1;
                }
                lastWord+=current;
            }
        
    }
        /*for(String a: tokenList){
            System.out.println(a);
        }*/
    }
    
    public static void addToken(String tk){
        tokenList.add(tk);
    }
    
    static String trimEnd(String str){
        char [] temp=str.toCharArray();
        int i=str.length()-1;
        for(; i>=0; i--){
            if(temp[i]!=' '){
                break;
            }
        }
        char [] newStr=new char[i+1];
        for(int j=0;j<=i;j++)
            newStr[j]=temp[j];
        return new String(newStr);
    }
    
    static ArrayList<String> splitLines(String code){ //retorna una lista de lineas de código separada por saltos de linea
        ArrayList<String> temp=new ArrayList();
        String[] charArray=code.split("\\n");
        for(String a: charArray){
            temp.add(trimEnd(a.replace("\t", "   ")));
        }
        return temp;
    }
    
    static boolean hasNextChar(ArrayList<String> fracCode){
        return position[0]<fracCode.size();
    }
    
    static char nextCharacter(ArrayList<String> fracCode){
        char next;
        if(fracCode.get(position[0]).length()>0){
            next = fracCode.get(position[0]).charAt(position[1]);
            last[0]=position[0];
            last[1]=position[1];
        }else{
            position[0] = position[0] + 1;
            position[1] = 0;
            next = nextCharacter(fracCode);
        }
        
        if(position[1] > fracCode.get(position[0]).length()-2){
            position[0] = position[0] + 1;
            position[1] = 0; //pasa a la siguiente linea
        }else if(next=='#' && (!lastWord.contains("\"")|| lastWord.matches("\"(\\w|\\W)*\""))){
            position[0] = position[0] + 1;
            position[1] = 0;
            next = nextCharacter(fracCode); //se ignoran los comentarios
        }else{
            position[1] = position[1] + 1; //pasa a la siguiente columna
        }
        return next;
    }
    
    public String nextToken(){
        String ans="$";
        if(pos<tokenList.size())
            ans = tokenList.get(pos);
        pos++;
        return ans;
    }
}
