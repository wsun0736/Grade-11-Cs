/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2ex5;
import java.util.Scanner;
/**
 *
 * @author waynesun
 */
public class Ch2Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
        int int1 = input.nextInt();
        System.out.println("Enter a Second Integer");
        int int2 = input.nextInt();
        System.out.println(int1+" / "+ int2 + "="+ (int1/int2));
        System.out.println(int1+" % "+ int2 + "="+ (int1%int2));
        System.out.println(int2+" / "+ int1 + "="+ (int2/int1));
        System.out.println(int2+" % "+ int1 + "="+ (int2%int1));
}
    
}
