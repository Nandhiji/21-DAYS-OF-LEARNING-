import java.util.*;

class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        String location=sc.next();
        String time=sc.next();
        int failed_attempts=sc.nextInt();

        if(failed_attempts>=3){
            System.out.println("LOCK");
        }

        int risk=0;

        if(amount>50000){
            risk++;
        }
        if(location.equals("new")){
            risk++;
        }
         
         String[] parts=time.split(":");
         int hour=Integer.parseInt(parts[0]);
        if(hour >=0 && hour <5){
            risk++;
        }

        if(risk>=2){
            System.out.println("HIGH");
        }
        else{
            System.out.println("LOW");
        }
             }

}
