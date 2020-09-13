
package a;
import java.util.Scanner;
import java.util.ArrayList;

public class A {

    public static void main(String[] args) {

     ArrayList<Integer>nums= new ArrayList();
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number between 1 and 50");
     System.out.println("Enter 111 to end ");
     int d=0;
     int total=0;
     int num[] =  new int[51];
     int count[]= new int[51];
     for(int c = 0;c>-1;d++){
         num=new int[c+1];
            int number = input.nextInt();
           
            if(number==111){
             break;
         }
          count[number]++;
            if(number>0&&number<51){
                nums.add(number);
                  num[c]=number;
                c++;
            }total+=number;
     }
     int max = 0;
     for(int c = 0; c<nums.size();c++){
         if(max<num[c]){
             max = num[c];
         }
         
     }
     for(int c=1;c<nums.size();c++){
         for(int i =0; i<nums.size()-1;i++){
             int a = nums.get(i);
             int b = nums.get(c);
      if(nums.get(c)<nums.get(i)){
          nums.set(c,a);
          nums.set(i,b);
      }
         }
     }double median=0;
     if(nums.size()%2==0){
         double a = nums.get(nums.size()/2);
         double b = nums.get((nums.size()/2)-1);
         median =(a+b)/2;
     }
     else if(nums.size()%2!=0){
         median = nums.get(nums.size()/2);
     }
     for(int c =0; c<nums.size();c++){
         
     }
     int maximum = num[0];
     for(int c =1 ;c<num.length;c++){
        if(count[c]>maximum){
            maximum = num[c];
        }}
     int counter=0;
        for(int w =0;w<num.length;w++){
            if(count[w]==maximum){
                counter++;
            }
        }
        if(maximum*counter==nums.size()){
            System.out.println("There is no mode");
        }else if(counter == 1){
            System.out.print("There is no mode\n");
        }
        else System.out.print("Mode: ");
        for(int c= 1;c<num.length;c++){
            if(count[c]==maximum){
                System.out.println(c+" ");
            }
        }
     
     System.out.println("The max is "+max);
     System.out.println("The average is "+total/nums.size());
     System.out.println(nums);
     System.out.format("The median is %.2f\n",median);
    }
    
}
