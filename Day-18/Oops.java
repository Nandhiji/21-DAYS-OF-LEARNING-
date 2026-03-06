// CREATING A CLASS 

public class Oops{
    String name;
    int a;

    void display(String name,int a){
        System.out.println(name);
        System.out.println(a);
    }

    public static void main(String[]args){
        Oops obj=new Oops();
        obj.display("abi",23);
        obj.display("hari",44);
    }
}