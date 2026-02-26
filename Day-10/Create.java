import java.util.*;

public class Create{
    public static void main(String[]args){
        String s1="hello";
        System.out.println(s1);

        String s1=new String("hello");
        
        String a="java";
        String b="JAVA";
       
        System.out.println(a.equals(b));


        Scanner sc=new Scanner(System.in);
        String email=sc.next();

       System.out.println("Length: "+ n.length());
        System.out.println("First letter: "+ n.charAt(0));
        System.out.println("upper case: "+n.toUpperCase());

EMAIL VALIDATION SYSTEM:

        if(email.contains("@") && email.contains(".com") && !email.contains(" ") && email.length()>10){
            System.out.println("valid password");
        }
        else{
            System.out.println("In valid password");
        }



    }
}