import java.util.*;

class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         String location=sc.nextLine();
        String time=sc.nextLine();
int amount=sc.nextInt();

int failed_attempts=sc.nextInt();
int risk=0;
if(amount>50000){
   risk++;
}
else if(location.equals("new")){
    risk++;
   }
 else if(time<=00:00 && time>=05:00){

   }
 else if(failed_attempts>=3){
    System.out.println("LOCKED");
   }

    }
}