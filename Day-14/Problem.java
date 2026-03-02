//REMOVE THE SPACES:
/*import java.util.*;
public class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       StringBuilder result=new StringBuilder();
      // String result="";
      
        
for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
        if(ch!=' '){         /// here ch=' ' irutha skip agidummm
            
           result.append(ch);
            
        }
}
System.out.println(result);
    }
}
*/

/*REMOVE THE DUPLICATES:

import java.util.*;
public class Problem{
    public static void main(System.in);
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();

    int[] count=new int[256];
    for(int i=0;i<256;i++){
        count[charAt(i)]++;
    }

    System.out.println("the duplicates are:");
    for(int i=0;i<256;i++){
        if(count[i]>1){
            System.out.println((char) i);

        }
    }
}*/

EXAMPLE CODE OF METHODS:

public class Problem{
    void add(){
        int result=5+10;
        System.out.println(result);
    }
    public static void main(String[]args){
        Problem obj=new Problem();
        obj.add(5,10);
    }
}


ONLINE SHOPPING APP:


public class Problem{
    void display(){
        System.out.println("welcome to the shop");
    }
       int  calculatetotal(int price, int quantity){
        return price*quantity;
    }
    public static void main(String[]args){
        Problem obj=new Problem();
        obj.display();
        int result=obj.calculatetotal(50,25);
        System.out.println(result);
         
    }
}

STUDENT RESULT SYSTEM:

class Main {
    String calculategrade(int mark){
        if(mark>=90){
            return "A";
        }
        
        else if(mark>75)
        {
            return "B";
        }
        
        else if(mark<=50){
             return ("c");
        }
       
        else{
        return ("D");
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
       String grade= obj.calculategrade(90);
        System.out.println(grade);
        
    }
}