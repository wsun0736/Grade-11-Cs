package ch10quiz;
import java.util.Scanner;
import java.util.ArrayList;
public class Ch10quiz {
    public static void main(String[] args) {
        int[]mark = new int[7];
        double avg =0;
        ArrayList<Integer>marks = new ArrayList();
        Scanner input = new Scanner(System.in);
          System.out.println("Enter 7 marks");
        for(int c =0;c<7;c++){
          
            int num=input.nextInt();
            mark[c]= num;
            marks.add(num);
                    avg+=num;
                    ;
        }
        int max = mark[0];
        int min = mark[0];
        for(int c =0; c<7;c++){
        if(mark[c]>max)max=mark[c];
        else if(mark[c]<min)min = mark[c];
            }

            avg-=max;
            avg-=min;
        System.out.println ("Discarded marks "+ max+","+ min);
        for(int c= 1; c<marks.size();c++){
            for(int f =0; f<marks.size()-1;f++){
                int a = marks.get(c);
                int b = marks.get(f);
                if(marks.get(c)<marks.get(f)){
                    marks.set(f,a);
                    marks.set(c, b);}
}

} System.out.println("Marks sorted");
        for(int c=1;c<marks.size()-1;c++){
           
            System.out.println(marks.get(c));
        }
double average = avg/(mark.length-2);
          System.out.format("The average is %.1f",average);
    
}}
