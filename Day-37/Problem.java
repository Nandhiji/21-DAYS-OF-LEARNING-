//password checker:

import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        
        boolean hasDigit=false;
        boolean hasUpperCase=false;
        boolean hasDuplicate=false;

        if(password.length() <6){
            System.out.println("weak password");
        }
            HashSet<Character> set=new HashSet<>();
            for (int i=0;i<password.length();i++) {
                char ch=password.charAt(i);

               if(Character.isDigit(ch)){
                hasDigit=true;
               }
               if(Character.isUpperCase(ch)){
                hasUpperCase=true;
               }
               if(set.contains(ch)){
                hasDuplicate =true;

               }
               else{
                set.add(ch);
               }
            }
            if(hasDigit && hasDuplicate && hasUpperCase){
                System.out.println("strong password");
            }
            else{
                System.out.println("weak password");
            }

            }

        }
    

   //TRANSACTION RISK ANALYZER:
import java.util.*;
   class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your amount");
        int amount=sc.nextInt();
        sc.nextLine();

        System.out.println("enter the location");
        String location=sc.next();
        System.out.println("enter the time");
        String time=sc.next();

        System.out.println("enter the failed attempts");
        int failed_attempts=sc.nextInt();

        if(failed_attempts >=3){
            System.out.println("BLOCKED");
            return;
        }
         int risk=0;
        if(amount >5000){
            risk++;
        }
        String[] parts=time.split(":");
        int hour=Integer.parseInt(parts[0]);
         if(hour >=0 && hour<=5){
            risk++;
        }
        if(location.equals("new")){
            risk++;
        }
        if(risk>=2){
            System.out.println("SUSPICIOUS");
        }
        else{
            System.out.println("SAFE");
        }
    }
   }