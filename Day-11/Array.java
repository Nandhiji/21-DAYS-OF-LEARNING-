import java.util.*;
public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

       /* System.out.println("Enter the number of student:");
        int n=sc.nextInt();
        
        int[] marks=new int[n];

        int sum=0,fail=0;

        System.out.println("enter the number of students marks:");

        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
            sum=sum+marks[i];
        }
        int min,max;

         max=min=marks[0];
        for(int i=0;i<n;i++){
            if(marks[i]>max){
                max=marks[i];
            }

            if(marks[i]<min){
                min=marks[i];
            }

            if(marks[i]<40){
                fail++;
            }
        }
            double ave=(double)sum/n;
        
        System.out.println("the highest mark is:"+max);
        System.out.println("the lowest mark is:"+min);
        System.out.println("the average mark is:"+ave);
        System.out.println("the failed student is:"+fail);
        */

       System.out.println("enter the number of days:");
       int n=sc.nextInt();

       int[] values=new int[n];
       int sum=0, count=0;

       System.out.println("enter the values:");

       for(int i=0;i<n;i++){
        values[i]=sc.nextInt();
        sum=sum+values[i];
       }

       int max,min;
       max=min=values[0];
       for(int i=0;i<n;i++){
        if(values[i]>max){
            max=values[i];
        }

        if(values[i]<min){
            min=values[i];
        }
        if(values[i]>2000){
            count++;

        }

       }
       System.out.println("the total days are:"+sum);
       System.out.println("the highest spending days are:"+max);
       System.out.println("the lowest spending days are:"+min);
       System.out.println("thow many days spend more then 2000:"+count);


    }
}