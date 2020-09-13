
package dd;
import java.util.Scanner;

public class Dd {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Input:");
       int threea= input.nextInt();
       int twoa= input.nextInt();
       int onea= input.nextInt();
       int threeb=input.nextInt();
       int twob = input.nextInt();
       int oneb= input.nextInt();
       int a = (threea*3)+(twoa*2)+onea;
        int b = (threeb*3)+(twob*2)+oneb;
        if(a>b){
            System.out.println("Team A wins");
        }else if(a<b){
            System.out.println("Team B wins");
        }else if(a==b){
            System.out.println("It is a tie");
        }
    }
    
}
