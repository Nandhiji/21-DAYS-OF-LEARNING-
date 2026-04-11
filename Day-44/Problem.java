//reverse the string:
import java.util.Scanner;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }
}
//count the frequency:
import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
          list.add(sc.nextInt());
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: list){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int key: map.keySet()){
            System.out.println(key+ "->"+map.get(key)+"times");
        }
    }
}
//second largest number:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> marks=new ArrayList<>();
      for(int i=0;i<n;i++){
            marks.add(sc.nextInt());
        }
        int highest=marks.get(0);
        int secondhighest=marks.get(0);
        for(int i=0;i<marks.size();i++){
            if(marks.get(i)>highest){
                secondhighest=highest;
                highest=marks.get(i);
            }
        
        else if(highest!=secondhighest && highest>=secondhighest){
            secondhighest=marks.get(i);
        }
        }
        System.out.println("second largest number is"+secondhighest);
    }
     
    }