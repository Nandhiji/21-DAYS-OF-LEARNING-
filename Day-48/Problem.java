import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder();
      
    
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);

        if(s.toString().contains(String.valueOf(ch))){
            continue;
        }
        else{
            sb.append(ch);
        }  
       }
        System.out.println(sb.toString());
}
}