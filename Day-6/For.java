import java.util.*;
public class For{
    public static void main(String[]args){

    FIND A DIVISIBLE BUY 3 AND 5 USING FOR LOOP:

        for(int i=1;i<=50;i++){
            if(i%3==0 && i%5==0){ 
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

FIND THE PASSWORD CORRECT OR WRONG USIG WHILE LOOP:

         Scanner sc=new Scanner(System.in);
         int password=0;
           while(password!=123){
            System.out.println("enter your password:");
            password=sc.nextInt();
    
           }
           System.out.println("access granted!");

        }

  SUM OF THE DIGITS:

       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your number:");
       int n=sc.nextInt();
       int sum=0;
       while(n!=0){
        int lastdi=n%10;
        sum=sum+lastdi;
        n=n/10;
       }
       System.out.println(sum);
    
    
   FIND A PALINDROME:

   Scanner sc=new Scanner(System.in);
   System.out.println("enter your number");
   int n=sc.nextInt();
   int original=n;
   int reverse=0;
   while(n!=0){
    int lastdi=n%10;
    reverse=reverse*10+lastdi;
    n=n/10;
   }
   if(original==reverse){
        System.out.println("palindrome");
    }
    else{
        System.out.println("not a palindrome");
    }
    }
}
