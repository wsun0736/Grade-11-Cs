/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author waynesun
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your name");
       String name = input.next();
       name = name.toUpperCase();
       System.out.println(name);
       String reverse ="";
       for(int a = name.length()-1;a>=0;a--){
           String rev = name.substring(a,a+1);
           reverse+=rev;
       }
       for (int b=0;b<name.length()-2;b++){
           String m = name.substring(b+1,b+2);
           System.out.print(m);
           for(int c = 0; c<name.length()-2;c++){
               System.out.print("*");
           }
           String end  = reverse.substring(b+1,b+2);
           System.out.println(end);
       }
       System.out.println(reverse);
    }
    
}
