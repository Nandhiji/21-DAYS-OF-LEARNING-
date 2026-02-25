import java.util.*;
public class Twod{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

/* System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();

        System.out.println("Enter the number of coloums:");
        int coloums=sc.nextInt();

        int[][] arr=new int[rows][coloums];

        System.out.println("Enter the values:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<coloums;j++){
                arr[i][j]=sc.nextInt();

            }
         }
         System.out.println("the values are");

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
         */


TRAVERSE ARRAY: 

        System.out.println("enter the number");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("the values are");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       

      System.out.println("the values are");

         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }



    }
}