 //REVERSED STRING:

import java.util.*;
public class Problem{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       // String original=s;

      /* String reversed="";

       for(int i=original.length()-1;i>=0;i--){
      // System.out.print(s.charAt(i));
      reversed=reversed+ s.charAt(i);
     

       }
FIND  A PALINDROME:

     if(original.equals(reversed)){      // we have to check the original and the reversed one ,, in numbers we usually use original==reversed , but in the string if we use == its check memory location but .equals() check only the content 
        System.out.println("its palindrome");
     }
     else{
        System.out.println("its not");
     }*/

//FIND THE VOWELS AND CONSONENTS COUNT:

int vowels =0;
/*
int consonents=0;
for(int i=0;i<s.length();i++){
     char ch=s.charAt(i);
    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I'|| ch=='O'|| ch=='U'){
        vowels++;
    }
    else if(Character.isLetter(ch)){
        consonents++;
    }
}
    System.out.println("vowels:"+vowels++);
    System.out.println("consonents"+consonents++);*/

int space=0;
for(int i=0;i<s.length();i++){
    char ch=  s.charAt(i);
    if(ch ==' '){
         space=space+1;
         
    }

}
 System.out.println(space);

    }
}