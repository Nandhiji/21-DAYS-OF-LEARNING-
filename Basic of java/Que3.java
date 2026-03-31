import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int request_count=sc.nextInt();
        if(request_count<=5){
            System.out.println("allowed");
        }
        else{
            System.out.println("blocked");
        }
    }
}