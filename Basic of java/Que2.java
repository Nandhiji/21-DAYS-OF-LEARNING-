import java.util.*;
class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total_message=sc.nextInt();
        int active=total_message;
        int compressed=total_message-100;
        if(total_message<=100){
            System.out.println("Status: Normal"+ "Active:"+total_message+"Compressed: 0");

        }
        else{
            System.out.println("Status: Optimized"+ "Active:"+100+"Compressed:"+compressed);
        }

    }
}