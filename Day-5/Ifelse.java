import java.util.*;
public class Ifelse{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

EVEN OR ODD:

        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }


FIND POSITIVE AND NEGATIVE AND ZERO NUMBERS:

       if(n>0){
        System.out.println("positive number");
       }
       else if(n<0){
        System.out.println("negative number");
       }
       else{
        System.out.println("zero number");
       }

FIND SMALL AND MEDIUM AND LARGE TO GIVE THE NUMBER:

      if(n>1 && n<=10){
        System.out.println("small");
      }
      else if(n>=11 && n<50){
        System.out.println("medium");
      }
      else if(n>=50){
        System.out.println("large");
      }
      else{
        System.out.println("Invalid");
      }

  FIND GIVEN NUMBER IS DIVISIBLE BY 3 OR 5:

     if(n%3==0 && n%5==0){
        System.out.println("Divisible by both 3 and 5");
     }
     else if(n%3==0){
        System.out.println("Divisible by only 3");
     }
     else if(n%5==0){
        System.out.println("Divisible by only 5");
     }
     else{
        System.out.println("not divisible by 3 or 5");
     }

FIND EVEN OR ODD:

    if(n%4==0 && n%100!==0) || (n%400==0){
        System.out.println(" leap year");
    }
    else {
        System.out.println(" non leap year");
    }
    }

 FIND WHICH NUMBER IS GREATER:

   if(n1>n2 && n1>n3){
    System.out.println("n1 is greater");
   }
   else if(n2>n1 && n2>n3){
    System.out.println("n2 is greater");
   }
   else{
    System.out.println("n3 is greater");
   }

FIND THE UPPERCASE AND LOWERCASE AND DIGIT NUMBER:

  if(ch>='A' && ch<='Z'){
    System.out.println("Upper case");
  }
  else if(ch>='a'&& ch<='z'){
    System.out.println("lower case");
  }
  else if(ch>='0' && ch<='9'){
    System.out.println("digit");
  }
  else{
    System.out.println("special ");
  }
}
