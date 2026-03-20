/*
import java.util.Scanner;

class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String username=sc.nextLine();
        boolean hasDigit=false;
        boolean hasLetter=false;
        if(username.length()<5 && username.length()>12 ){
            System.out.println("valid username");
        }
        
        for(int i=0;i<username.length();i++){
            char ch=username.charAt(i);
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
            if(Character.isLetter(ch)){
                hasLetter=true;
            }
    }
    if(hasDigit && hasLetter){
        System.out.println("valid username");
    }
    else{
        System.out.println("invalid username");
    }
}
}*/
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
       
       /* set.add(1);
        set.add(1);
        set.add(3);
        System.out.println(set.size());
*/
/*
HashSet<String> set =new HashSet<>();
set.add("abi");
System.err.println(set.size());*/

unique vistior counter:

       for(int i=0;i<n;i++){
       int id=sc.nextInt();
         set.add(id);
       }
       System.err.println(set);
       System.out.println(set.size());


    }
}