/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author waynesun
 */

public class add {
    public static double total=0;
    public static void a(double burgers,double salad,double fries, double soda){
        burgers= burgers*1.85;
        salad =salad*2;
        fries = fries*1.3;
        soda = soda*.95;
        total = burgers+salad+fries+soda;
    }
}
