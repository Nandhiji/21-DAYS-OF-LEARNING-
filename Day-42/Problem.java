/*import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int last =list.get(list.size()-1);

        for(int i=list.size()-1;i>0;i--){
            list.set(i,list.get(i-1));
        }
        list.set(0,last);
        System.out.println(list);

    }
}*/
import java.util.*;
class problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
       for (int i = 0;  i<n;i++) {
           list.add(sc.nextInt());
           if(list.get(i)!=0){
            list.add(i);
           }
           else{
            list.add(list.size()-1);
           }
       }
       System.out.println(list);

      
       }
       }
            
    