import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
          int count=0;
       for(int i=0;i<word.length();i++){
        char ch=word.charAt(i);
    
        if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='u' || ch=='U'){
            count++;
        }
      
    }
    System.out.println(count);
}
}
    
