import java.util.*;
public class Arr{
    public static void main(String[]args){

      /*  Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of array:");
        int n=sc.nextInt();
        int max=0;
        
        int[] arr=new int[n];
          System.out.println("enter the elements of array:");
        for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
             if(arr[i]>max){
                max=arr[i];
            
             }
            
        }
        System.out.println("the largest no:"+max);
       /* for(int i=0;i<arr.length;i++){
            System.out.println(max);
        }*/

       

    Scanner sc=new Scanner(System.in);

    
     System.out.println("enter the number of temperature:");
     int n=sc.nextInt();
    
     int[] arr=new int[n];
    System.out.println("enter the value of temperature:");
    arr[0]=sc.nextInt();
    
    int sum=arr[0];
    int max=arr[0];
    int min=arr[0];
    
    
    for(int i=1;i<n;i++){
        arr[i]=sc.nextInt();
        

        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
            min=arr[i];
        }

        sum=sum+arr[i];
    }
    

    double aver=(double)sum/n;
    System.out.println("the maximum no:"+ max);
     System.out.println("the minimum no:"+ min);
    System.out.println("the average no:"+ aver);    
    }
}