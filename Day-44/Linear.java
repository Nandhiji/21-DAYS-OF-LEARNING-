/*import java.util.*;
class Linear{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println("enter the found element:");
        int target=sc.nextInt();
        boolean found=false;

        for(int i=0;i<list.size();i++){
            if(list.get(i)==target){
                System.out.println("found at index"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}
*/
import java.util.*;
class Linear{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("enter the found element is:");
        int target=sc.nextInt();
        int start=0;
        int end=n-1;
        boolean found=false;
        while(start <= end){
        int mid=(start+end)/2;
        if(target==list.get(mid)){
            System.out.println("found");
            found=true;
            break;
        }
        else if(target > list.get(mid)){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        }
        if(!found){
            System.out.println("not found");
        }
    }
}