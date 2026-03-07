STUDENT DETAILS:
public  class Student{

    String name;
    int mark;

    public static void main(String[]args){
        Student s1=new Student();
        s1.name="nandhini";
        s1.mark=18;

        System.out.println(s1.name+" "+s1.mark);

    }
}

TWO OBJECTS:

public class Student{
    int price;
    String brand;
    public static void main(String[]args){
        Student s1=new Student();
        Student s2=new Student();

        s1.price=50000;
        s2.price=70000;

        s1.brand="bmw";
        s2.brand="toyota";
        System.out.println("Car1:"+ s1.brand+" "+s1.price);
        System.out.println("Car2:"+ s2.brand+" "+s2.price);


    }
}
REFERENCE COPY:

public class Student{

    String title;
    public static void main(String[]args){
        Student s1=new Student();
        s1.title="java basics";
        Student s2=s1;

        System.out.println(s1.title);

    }
}
NULL REFERENCE:

public class Student{
    String model;
    public static void main(String[]args){
        Student s1=null;
        System.out.println(s1.model);

    }
}
REFERENCE CHANGE:

public class Student{
    int salary;
    String name;
    public static void main(String[]args){
        Student s1=new Student();
        s1.salary=3343;
        s1.name="nandini";
        Student s2=s1;

        s2.salary=3000;

        System.out.println(s1.salary);

    }
}
Bank Account:
public class Student{
    String accountHoldername;
    int balance;
    public static void main(String[]args){
        Student s1=new Student();
        Student s2=new Student();
        s1.accountHoldername="anu";
        s1.balance=50000;

        s2.accountHoldername="hari";
        s2.balance=10000;

        System.out.println(s1.accountHoldername+" "+s1.balance);
         System.out.println(s2.accountHoldername+" "+s2.balance);
        

    }
}

ATM  withdraw SYSTEM:

public class Student{
    String accountHoldername;
    int balance;
    public static void main(String[]args){
        Student s1=new Student();
        
        s1.accountHoldername="anu";
        s1.balance =5000;
        int withdraw =2000;
        int update=s1.balance-withdraw;

       System.out.println(update);

    }
}