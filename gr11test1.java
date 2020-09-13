/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author waynesun
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a= false, b =false,c=false,d=false, e =true,f =false, g=false,h=false,i=true;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a email");
        String email = input.nextLine();
        System.out.println("Enter a password");
        String password = input.nextLine();
      if(email.indexOf("@")>=3){
          a= true;
      }
      if(email.substring(email.indexOf("@")+1,email.length()).equals("hwdsb.on.ca")){
          b=true;
      }
      if(password.length()>=6){
          c=true;
      }
      String aa= password.toUpperCase();
      char start = aa.charAt(0);
      int so = start-65;
    
      if(so>-1&&so<26){
          d=true;
      }
      for(int count= 0; count<password.length();count++){
          if(password.substring(count,count+1).equals(" ")){
              e= false;
              break;
          }
      }
     for(int count = 0; count<password.length();count ++){
         int cot = password.charAt(count);
         int co = password.charAt(count);
         co-=65;
         if(co>-1&&co<26){
          f=true;
     
      }
         if(cot>47&&cot<58){
             g=true;
         }
     }
     for(int count = 0 ;count<password.length();count++){
         if(password.substring(count,count+1).equals("*")){
             h= true;
             break;
         }
         else if(password.substring(count,count+1).equals("@")){
             h= true;
             break;
         }
          else if(password.substring(count,count+1).equals(">")){
             h= true;
             break;
         }
          else if(password.substring(count,count+1).equals("$")){
             h= true;
             break;
         }
     
     }
String rev="";
    String s = email.substring(0,email.indexOf("@"));
    for(int v =s.length()-1 ; v>=0;v--){
       rev+= s.charAt(v);
     }
     if(password.contains(s)||password.contains(rev)){
         i=false;
     }
     
     
     
      if(a&&b&&c&&d&&e&&f&&g&&h&&i){
          System.out.println("Email and password accepted");
      }
      else{
          System.out.println("Email and password not accepted");
      }
      
    }
    
}
