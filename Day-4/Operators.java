import java.util.*;
public class Operators{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("addition:"+(a+b));
        System.out.println("multiplication:"+(a*b));
        System.out.println("division:"+(a/b));
        System.out.println("remainder:"+(a%b));

        if(a>b){
            System.out.println("true");
        }

         if(a>b && b<5){
            System.out.println("true");
        }
       
            System.out.println("post increment:"+(a++));
            System.out.println("after post increment:"+a);
        
        System.out.println("pre increment:"+(++a));
        System.out.println("pre decrement:"+(--b));

    }
}