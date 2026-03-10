static variable : 

public class Oops{
   static  String name="nandhini";

    public static void main(String[]args){
        Oops obj=new Oops();
        Oops obj2=new Oops();
        System.out.println(Oops.name);
    }
}
 
final keyword;
public class Oops{
    final int x=19;

    public static void main(String[]args){
        
        System.out.println(x);

    }
}
static final keyword;

public class Oops{

    static final double pi=3.14;
    public static void main(String[]args){
        Oops obj=new Oops();

        System.out.println(obj.pi);

    }
}

Game maximum level;
public class Oops{

    final int MAX_LEVEL= 5;
    public static void main(string[]args){
        System.out.println(Oops.MAX_LEVEL);

    }
}


bank account number:

public class Oops{
    final int accountnumber=1233;

    void display(){
        System.out.println("account number:"+ accountnumber);
    }
    public static void main(string[]args){
        Oops obj=new Oops();
        obj.display();

    }
}