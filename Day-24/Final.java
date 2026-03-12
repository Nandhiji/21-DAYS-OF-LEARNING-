/*final keyword:


public class Final{
    final int x=10;
    public static void main(String[] args) {
        
        Final obj=new Final();
        obj. x=20;
        System.out.println(obj.x);
    }
}*/

/*final method:
class Animal{
    final void sound(){
        System.err.println("this is sound");

    }

}

class Dog extends Animal{
    void sound(){
        System.err.println("dog barking");
    }
}


    
    public class Final{
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.sound();
        
    }
}*/

final class:
final class Animal{
    void sound(){
        System.out.println("ohhhhhhhh");
    }
}

/*class Dog extends Animal{
    void sound(){
        System.out.println("dog barking");
    }
}
*/
public class Final{
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.sound();
    }
}