Bubble sort program:
import java.util.*;
class Problem{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();

      ArrayList<Integer> list=new ArrayList<>();

      for(int i=0;i<n;i++){
        list.add(sc.nextInt());
      }

      for(int i=0;i<list.size()-1;i++){
        for(int j=0;j<list.size()-1-i;j++){
            if(list.get(j) > list.get(j+1)){
            int temp=list.get(j);
            list.set(j,list.get(j+1));
            list.set(list.get(j),temp);
            }


        }
      }
      System.out.println(list);

    }
}