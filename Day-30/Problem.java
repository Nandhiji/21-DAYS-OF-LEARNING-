import java.util.*;
public class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
boolean hasDigit=false;
boolean hasUpperCase=false;
boolean hasLowerCase=false;
        if(password.length()< 8){
            System.out.println("weak password");
        }

        for(int i=0;i<password.length();i++){

            char ch=password.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }
            if(Character.isLowerCase(ch)){
                hasLowerCase=true;
            }
        }
            if(hasDigit && hasUpperCase && hasLowerCase){
               System.out.println("strong password");
            }

            else{
                System.out.println("weak password");
            }
    }
}