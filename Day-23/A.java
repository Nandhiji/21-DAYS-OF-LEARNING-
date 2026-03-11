/*package Day23;

public class A {

    public static void main(String[] args) {
System.out.println("Hello World");
    }


*/

public class A{
    static int a=3;
    static int b;

    static{
        System.out.println("i am a static block");  // static block only run once 
        b=a +5;
    }
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(A.a+ " "+ A.b);

        A.b+=1;
        A obj2=new A();
        System.out.println(A.a+ " "+ A.b);


    }
}