no parameters, without return value;

public class Coo{

    void hello(){
        System.out.println("hello");
    }
    public static void main(String[]args){
        Coo obj=new Coo();
        obj.hello();
        
    }
}

with parameters, no return value;

class Main {
    
    void hello(int a, int b){
       int sum=a+b;
       System.out.println(sum);
    }
    public static void main(String[] args) {
        Main obj=new Main();
        obj.hello(3,2);

    }
}


METHOD WITH PARAMETERS RETURN VALUE:

class Main {
    int hello(int a, int b){
      return a+b;
    }
    public static void main(String[] args) {
        Main obj=new Main();
        int result=obj.hello(2,5);
        System.out.println("addition"+result);
    }
}


with return value with out parameters;


class Main {
    
    int hello(){
      return 43;
      
    }
    public static void main(String[] args) {
        Main obj=new Main();
        int result=obj.hello();
        System.out.println("values"+result);
    }
}

--------------------------------------
problem :


class Main {
    void welcome(){
        System.out.println("welcome to the bank");
    }
    
    void deposit(int a){
        int deposit=a;
        System.out.println(deposit);
    }
    
    int  balance(){
        return 5000;
    }
    
    int transfer(int a){
        return a;
    }
    
    public static void main(String[] args) {
        Main obj=new Main();
        obj.welcome();
        obj.deposit(5000);
       int balance= obj.balance();
       System.out.println(balance);
       int transfer=obj.transfer(600);
       System.out.println(transfer);
       
    }
}