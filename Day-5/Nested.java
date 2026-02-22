import java.util.*;
public class Nested{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*System.out.println("enter your mark:");
        int mark=sc.nextInt();
        System.out.println("enter your attendance percentage");
        
        int attendance=sc.nextInt();

      if(mark<0 || attendace<0 || mark>100 || attendace>100){
        System.out.println("Invalid input");
      }

        else if(mark>=85){
            if(attendance>=75){
                System.out.println("eligible for scholarship");
            }
            else{
                System.out.println("good marks but low attendace");
            }
        }
        else{
            System.out.println("not eligible");
        }*/



       System.out.println("enter your username:");
       String username=sc.next();

       System.out.println(" enter your password:");
       int password=sc.nextInt();

       if(username.equals("admin")){
        if (password==1234){
            System.out.println("login successful");
        }
        else{
            System.out.println("wrong password");
        }
       }
       else{
        System.out.println("invalid username");
       }
    }
}