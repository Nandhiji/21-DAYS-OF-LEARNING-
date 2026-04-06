

/*remove even number from the list:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
        }}
        */
      /* largest number from the arraylist
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }            
        int largest=0;

        for(int i=0;i<list.size();i++){
            if(list.get(i)>largest){
                largest=list.get(i);
            }
        }
        System.out.println(largest);
        }}
    */
import  java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("Nandhini");
        sb.insert(1,5);
        System.out.println(sb);
    }
}