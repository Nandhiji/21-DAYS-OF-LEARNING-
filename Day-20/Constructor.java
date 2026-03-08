ENCAPSULATION:

public class Constructor{
    private int balance;

    void doposit(int amount){
        balance=balance+amount;

    }
    void withdraw(int amount){
        if(balance>amount){
            balance=balance-amount;
        }
        else{
            System.out.println("there is no need of money");
        }
        

    }
    void getbalance(){
        System.out.println(balance);

    }
    public static void main(String[]args){
        Constructor obj=new Constructor();
        obj.doposit(0);
        obj.withdraw(1000);
        obj.getbalance();

    }
}

INHERITANCE:

class Animal {
    void dog(){
        System.out.println("dog is barking");
    }
}
    class Cat extends Animal{
        void cat(){
            dog();
            System.out.println("cat is meowing");
        }
    }

public  class Constructor{

    public static void main(String[]args){
        Cat obj=new Cat();
        obj.cat();

      
       

        
    }
}

INHERITANCE WITH EMPLOYEE PROBLEM :
class Employee{
    void manage(){
        System.out.println("employee is working");
    }
}
class Manager extends Employee{
    void manage(){
        System.out.println("manager is managing");
    }
}
public class Constructor{
   
    public static void main(String[]args){
       Employee obj=new Manager();
      
       obj.manage();
    }
}
polymorphism:  compile time polymorphism


public class Constructor{

    int add(int a, int b){
       return a+b;
    }
        int add(int a, int b, int c){
       return a+b+c;
    }
    public static void main(String[]args){
        Constructor obj=new Constructor();
        System.out.println(obj.add(5,10));
        System.out.println(obj.add(1,2,3));
        
    }
}

interface :

interface Animal{
    void sound();

}
class Dog implements Animal{
   public void sound(){
        System.out.println("dog is barking");
    }
}
public class Constructor{
    public static void main(String[]args){
        Dog obj=new Dog();
        obj.sound();
       
    }

}