/*reverse a string:

import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
    
        System.out.println(sb.reverse());

    }
}*/
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int first=list.get(0);
        for(int i=0;i<list.size()-1;i++){
            list.set(i,list.get(i+1));
        }
        list.set(list.size()-1,first);
        System.out.println(list);

    }
}