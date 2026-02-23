import java.util.*;
public class Array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of array:");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter the array element:");
        for(int i=0;i<arr.length;i++){
           
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the values are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        
        

    }
}