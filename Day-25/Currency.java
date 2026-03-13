/*import java.util.*;
import java.text.*;
public class Currency{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        sc.close();

        //us 
        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
         // india
        // NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
         Locale indiaLocale=new Locale("en","IN");
         NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
            // china
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        // france
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: "+us.format(amount));
        System.out.println("India: "+india.format(amount));
        System.out.println("China: "+china.format(amount));
        System.out.println("France: "+france.format(amount));

    }
}*/
/*BANK ACCOUNT SYSTEM:(use private modifier)

public class Currency{
   private  int balance=1000;
   void doposit(int amount){
    balance+=amount;
   }
   void withdraw(int amount){
    if(balance < amount){
        System.out.println("insufficient amount");
    } 
    else{
        balance-=amount;
    }
   }
   void showbalace(){
    System.out.println("Balance: "+balance);
   }
   
    public static void main(String[]args){
        Currency c=new Currency();
        c.doposit(0);
        c.withdraw(1500);
        c.showbalace();


    }
}*/
/*
protected access modifier example:
 class Curr{
    protected int marks=70;
}
class Student extends Curr{
     void showresults(){
        System.out.println("Marks: "+marks);
    }

}
    public class Currency{
    public static void main(String[] args) {
        Student c=new Student();
        c.showresults();
    }
    }*/
   /*
   public modifier example:
class Curr{
    public int balance=1000;
    public void show(){
        System.out.println("Balance: "+balance);
    }
}
   public class Currency{
        public static void main(String[] args) {
        Curr c=new Curr();
        c.show();
    }
   }*/

  /*
default access modifier example:
  public class Currency{
    int x=88;
    public static void main(String[] args) {
        Currency c=new Currency();
        System.out.println(c.x);
    }
  }
*/