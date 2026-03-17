import java.util.*;

public class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
       
        for(int i=0;i< n;i++){
           int x=sc.nextInt();
           list.add(x);
        }
        //list.add(10);
        for(int i=0;i<list.size();i++){
System.out.println("the elements are"+list.get(i));
        }
        
    }
}