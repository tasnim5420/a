/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laxical;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class Laxical {

    
     public static ArrayList keywords = new ArrayList();
    public static ArrayList number= new ArrayList();
    public static ArrayList math= new ArrayList();
    public static ArrayList logical= new ArrayList();
    public static ArrayList identifiers= new ArrayList();
    public static ArrayList others= new ArrayList();
    public static String[] key = {"break","case","char","continue","do","double","else","float","for","if","int","return","switch","void","while"};
    public static String token="";
    public static String[] mathOp = {"+","-","*","/","="};
    public static String[] logicOp = {"==","===","!=","||","&&","<",">","<=",">="};
    public static String[] Other = {"(",")","{","}","[","]",",","?",";",":"};
    public static void main(String[] args) throws FileNotFoundException {
        
     File f = new File("G:\\Life is Code\\Compiler design\\Lexical Analyser/input.txt");
        Scanner inputLine = new Scanner(f);
        while (inputLine.hasNextLine()) {
            String line = inputLine.nextLine();
            StringTokenizer strToken = new StringTokenizer(line);
            while (strToken.hasMoreTokens()) {
                token = strToken.nextToken();
                for(String keys : key){
                    if(token.equals(keys) && !keywords.contains(token)){
                        keywords.add(token);
                        break;
                    }
                    else if(token.matches("[a-zA-Z]") && !identifiers.contains(token)){
                        identifiers.add(token);
                        break;
                    }
                }
                if(token.matches(".*[0-9].*") && !number.contains(token)){
                    number.add(token);
                    break;
                }
        
                for(String mathop : mathOp){
                    if(token.equals(mathop) && !math.contains(token)){
                        math.add(token);
                        break;
                    }
                }
                for(String logic : logicOp){
                    if(token.equals(logic) && !logical.contains(token)){
                        logical.add(token);
                        break;
                    }
                }
                for(String other : Other){
                    if(token.equals(other) && !others.contains(token)){
                        others.add(token);
                        break;
                    }
                }
            }
        }
        System.out.print("Keywords are: ");
        keywords.forEach((keyword) -> {
            System.out.print(keyword+"   ");
        });
        System.out.println();
        System.out.print("Numerical Values: ");
        number.forEach((num) -> {
            System.out.print(num+"   ");
        });
        System.out.println();
        System.out.print("Math operators: ");
        math.forEach((mathop) -> {
            System.out.print(mathop+"   ");
        });
        System.out.println();
        System.out.print("Logical operators: ");
        logical.forEach((logicop) -> {
            System.out.print(logicop+"   ");
        });
        System.out.println();
        System.out.print("Identifiers are: ");
        identifiers.forEach((ident) -> {
            System.out.print(ident+"   ");
        });
        System.out.println();
        System.out.print("Others: ");
        others.forEach((other) -> {
            System.out.print(other+"   ");
        });
    }       
}
       
    

