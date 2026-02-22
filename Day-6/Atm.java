import java.util.*;
public class Atm{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
           
            int balance=50000;
            while(true){
                 System.out.println("select the choice:");
                System.out.println("1.check bank balance");
                 System.out.println("2.deposit");
                  System.out.println("3.withdraw");
                   System.out.println("4.exit");
           int choice=sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("the bank balance are:"+balance);
                        break;
                    case 2:
                        System.out.println("how much amount are you gonna doposit:");
                        int doposit=sc.nextInt();
                        balance=balance+doposit;
                        System.out.println("your total amount is:"+balance);
                        break;
                    case 3:
                        System.out.println("how much amount are you gonna withdraw:");
                        int withdraw=sc.nextInt();
                        balance=balance-withdraw;
                        System.out.println("now your current amount is:"+balance);
                        break;
                    case 4:
                        default:
                            System.out.println("thank you!");
                           return;
                }
            }
            }

        }

    
