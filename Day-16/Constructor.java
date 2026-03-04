BASIC CONSTRUCTOR:

public class Constructor{

    String name;
    int age;

    Constructor(String n, int a){
        name=n;
        age=a;
    }

    void display(){
        System.out.println(name+" "+ age);
    }
    public static void main(String[]args){
        Constructor obj=new Constructor("nandhini",19);
      obj. display();

    }
}

CONSTRUCTOR WITH THIS KEYWORD:

public class Constructor{

    String name;

    Constructor(String name){
        this.name=name;
    }
    void display(){
        System.out.println(name);
    }
    public static void main(String[]args){
        Constructor obj=new Constructor("nandhini");
        obj.display();

    }
}

CONSTRUCTOR CHAINING:

public class Constructor{
    Constructor(){
        this(10);
        System.out.println("default");
    }

    Constructor(int s){
        System.out.println("parameter");
    }

    public static void main(String[]args){
        Constructor obj=new Constructor();
        
    }
}

BANK ACCOUNT SYSTEM:

public class Constructor{
    String name;
    int number;
    double balance;

    Constructor(String name,int number, double balance){
        this.name=name;
        this.number=number;
        this.balance=balance;
    
    }

    void display(){
        System.out.println("name"+ name);
        System.out.println("number"+ number);
        
        System.out.println("balance"+ balance);
        

    }
    public static void main(String[]args){

        Constructor obj=new Constructor("nandhini",23432,343.23);
        obj.display();


    }
}