/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
/**
 *
 * @author LFern
 */
public class User {
    
    public static String textInput(){
        int ch;
        String texto = "";
        boolean flag = false;
        while (!flag){
            try{            
                ch = System.in.read();
                if (ch < 0 || (char) ch == '\n'){
                    User.printText("Caracter invalido");
                    flag = true;
                }else{
                    if((char)ch != '\r'){
                        texto = texto + (char) ch;
                    }
                }
            }catch (java.io.IOException e) {
                User.printText("Error en input de texto");
            }
        }        
        return texto;
    }
    
    public static int intInput(){
        Scanner inp = new Scanner(System.in);
        int entero = inp.nextInt();
        return entero;
    }
    
    public static void printText(String msg){
        System.out.println(msg);
    }
    
    public static void printInt(String msg, int number){
        System.out.println(msg + number);
    }
    
}
