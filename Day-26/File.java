//bank withdrawal example using try-catch-finally block in Java
class Fi{
    int balance=3000;

    void withdraw(int amount){
        if(amount>balance){
            throw new ArithmeticException("Insufficient balance");
        }
        balance-=amount;
        System.out.println("Withdrawal successful. Remaining balance: "+balance);

    }
}
public class File{

    public static void main(String[] args) {
        Fi di=new Fi();

        try {
            di.withdraw(100);
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        finally{
            System.out.println("transaction completed");
        }
    }
}
//login system example using try-catch-finally block in Java

class Fi{
    void password(String password){
        if(!password.equals("admin893")){
            throw new ArithmeticException("wrong password");
        }
        else{
            System.out.println("password is correct");
        }
    }
}
public class File{
    public static void main(String[] args) {
        Fi nu =new Fi();

        try {
            nu.password("admin893");
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
        finally{
            System.out.println("process completed");
        }
    }
}
