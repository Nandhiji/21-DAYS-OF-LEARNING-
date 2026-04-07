/*remove vowels from the sentence:
import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

        if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
            sb.append(ch);
        }
    }
    System.out.println(sb);
}
}*/

//remove duplicates and count unique:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<n;i++){
        list.add(sc.nextInt());
       }
    int count=0;
       LinkedHashSet<Integer> set=new LinkedHashSet<>(list);
       for(int vel:set) {
 System.out.println("non duplicates values"+vel);
        count++;
       }
       
       System.out.println("the counts are"+count);
       }

        }
    