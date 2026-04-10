//student result system:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> marks=new ArrayList<>();
       
        for(int i=0;i<n;i++){
            marks.add(sc.nextInt());
        }
        boolean isFail=false;
        for(int i=0;i<marks.size();i++){
        if(marks.get(i)< 35){
            isFail=true;
            break;
        }
        
        }
        if(isFail){
            System.out.println("FAIL");
        }
        else{
            System.out.println("PASS");
        }
        int sum=0;
        for (int  i= 0; i <n ; i++) {
            sum+=marks.get(i);
        }
        int avg=sum/n;
        if(avg>=90){
            System.out.println("A++");
        }
        else if(avg>=75){
            System.out.println("A");
        }
        else if(avg>=60){
            System.out.println("B");
        }
        else{
            System.out.println("C");
        }
        
        if(avg>=90){
            System.out.println("Topper");
}
        int max=marks.get(0);
        int min=marks.get(0);
        for(int i=1;i<marks.size();i++){
            if(marks.get(i)==max){
                max=marks.get(i);
            }
            else  {
                min=marks.get(i);
            }
        }
        System.out.println("the highest mark is:"+max);
        System.out.println("the lowestr mark is:"+min);

/*int min=0;
        for(int i=0;i<marks.size();i++){
            if(marks.get(i)<min){
                min=marks.get(i);
            }
        }
        System.out.println("the lowest mark is:"+min);
        */
    }
}
        
        
