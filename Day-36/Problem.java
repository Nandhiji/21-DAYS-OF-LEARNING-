/*import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            int result=a/b;
            System.out.println("result"+ result);
        } 
        catch(ArithmeticException e){
            System.out.println("division by zero");
        }
        finally{
            System.out.println("Program completed");
        }
    }
}
*/
/*
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
              int a=sc.nextInt();
              System.out.println("number"+a);
        }
        catch(InputMismatchException e){
            System.out.println("invalid input");
        }
    }
}
*/
/*
import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
          int n=sc.nextInt();
          int arr[]=new int[n];
          System.out.println("enter the elements");
          for(int i=0;i<n;i++)
          {
            arr[i]=sc.nextInt();
          }
          int index=sc.nextInt();
        try {
            System.out.println("element"+arr[index]);
        }
         catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("invalid index");
        }
    }
}
*/
import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=a/b;
        System.out.println("result"+result);
        
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=sc.nextInt();
        System.out.println("element"+arr[index]);
            
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid index");
        }
        catch(InputMismatchException e){
            System.out.println("invalid input");
        }
        finally{
            System.out.println("the program was executed successfully");
        }
        }}
    