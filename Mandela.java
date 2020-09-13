/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mandela;
import java.util.Scanner;
/**
 *
 * @author waynesun
 */
public class Mandela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int player =1; 
       boolean done = false;
       int[]bins = {3,3,3,3,3,3,0,3,3,3,3,3,3,0};
       char[]chaar = {'A','B','C','D','E','F'};
          Display(bins,chaar);
       while(!done){
           if(!(check(player,bins))){
               
               break;
           }
        System.out.println("\nPlayer "+player+": Pick a Choice\n");
       char loco = input.next().charAt(0);
       int chard=0;
       if(player==1){
       chard = loco-65;}
       else if(player==2){
           chard = ((loco-65)-5)*-1;
       }
        player=set(bins,player,chard,chaar);
       
       }
       if(bins[6]>bins[13]){
           System.out.println("\nCongrats! Player 1 wins!");
       }
       else if(bins[13]>bins[6]){
           System.out.println("\nCongrats! Player 2 wins!");
       }
    }
    public static void Display(int[]bins, char[]a){
   
       
        System.out.println("");
        for(int c = 7;c<bins.length-1;c++){
          
            System.out.print("   "+bins[c]+" ");
        }
        System.out.print("\n"+bins[6]+"\t\t\t\t"+ bins[13]+"\n");
        for(int c = 0; c<6;c++){
            System.out.print("   "+bins[c]+" ");
        }
        System.out.print("\n");
        for(int c=0;c<6;c++){
                  System.out.print("   "+a[c]+" ");
        }
    }
    public static boolean check(int player,int[]bins){
        boolean check =false;
        if(player==1){
            for(int c=0;c<6;c++){
                if(bins[c]!=0) check =true;
            }
        }
        else if(player ==2){
            for(int c= 7;c<bins.length-1;c++){
                if(bins[c]!=0)check =true;
            }
        }
        return check;
    }
public static int set(int []bins,int player, int choice, char[]a){
   
        if(player ==1){
             int stones = bins[choice];
        bins[choice]=0;
            for(int c=0; c< stones;c++){
                choice+=1;
                if(choice==13){choice=0;}
                bins[choice]++;  
            }
         if (choice == 6){player =1;choice++;}
              else player =2;
         if((choice>=0&&choice<=5)&&bins[choice]==1){
             if(choice==0){
             bins[6]+=bins[choice+12];
             bins[choice+12]=0;}
             else if(choice==1){
             bins[6]+=bins[choice+10];
             bins[choice+10]=0;}
             else if(choice==2){
             bins[6]+=bins[choice+8];
             bins[choice+8]=0;}
             else if(choice==3){
             bins[6]+=bins[choice+6];
             bins[choice+6]=0;}
             else if(choice==4){
             bins[6]+=bins[choice+4];
             bins[choice+4]=0;}
            else if(choice==5){
             bins[6]+=bins[choice+2];
             bins[choice+2]=0;}
         }
        }
        
            else if (player ==2){
                 
                int stones = bins[choice+7];
        bins[choice+7]=0;
                choice+=7; 
              for(int c =0; c<stones;c++){
                  choice+=1;
                  if(choice==6)choice+=1;
                  if(choice>13)choice=0;
                  bins[choice]++;
               
              }
              if (choice==13)player =2;
              else player =1;
              if((choice>=7&&choice<=12)&&bins[choice]==1){
                  
                  if(choice==12){
                  bins[13]+=bins[choice-12];
                  bins[choice-12]=0;}
                   else if(choice==11){
                  bins[13]+=bins[choice-10];
                  bins[choice-10]=0;}
                   else if(choice==10){
                  bins[13]+=bins[choice-8];
                  bins[choice-8]=0;}
                   else if(choice==9){
                  bins[13]+=bins[choice-6];
                  bins[choice-6]=0;}
                   else if(choice==8){
                  bins[13]+=bins[choice-4];
                  bins[choice-4]=0;}
                   else if(choice==7){
                  bins[13]+=bins[choice-2];
                  bins[choice-2]=0;}
              }
            }
        System.out.println("");
        int d=0;
        for(int c = bins.length-1;c>7;d++){
          c-=1;
            System.out.print("   "+bins[c]+" ");
        }
        System.out.print("\n"+bins[13]+"\t\t\t\t"+ bins[6]+"\n");
        for(int c = 0; c<6;c++){
            System.out.print("   "+bins[c]+" ");
        }
        System.out.print("\n");
        for(int c=0;c<6;c++){
                  System.out.print("   "+a[c]+" ");
   
}return player;
}
}

        
    


