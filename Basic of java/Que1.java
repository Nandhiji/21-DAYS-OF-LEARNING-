import java.util.*;
class Que1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String employment=sc.nextLine();
        int credit_score=sc.nextInt();
        int income=sc.nextInt();
        int emi=sc.nextInt();
        
        if(credit_score<=600 && credit_score>=749 ){
            System.out.println("approved");
        }
        else if(credit_score>=750){
            if(income<25000){
             System.out.println("rejected");
            }
            else{
                income=income+50*100;
            }
        }
   
    if(employment.equals("Salaried")){
        System.out.println("salaried");
    }
        
        if(credit_score>=800){
            System.out.println("%7");

        }
        else if(credit_score<=750 && credit_score>=799){
            System.out.println("8%");
        }
        

        }

}
    