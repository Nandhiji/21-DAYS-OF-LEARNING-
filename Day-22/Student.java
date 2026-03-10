/*public class Student{
    int rno=1;
    String name;
    float marks;

    Student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks; // this keyword means curent obj

    }

    Student(Student other){
        this.name=other.name;

    }
    public static void main(String[]args){
       // Student obj=new Student(4,"nanhd",4.2f);

        Student rand=new Student(4,"nanhd",4.2f);
        System.out.println(rand.name);
    

       
    }
}*/

/*public class Student{
    String name;
    //Student( String name){
      //  this.name=name;

    
    public static void main(String[]args){
        Student one=new Student();
        Student two=one;
        one.name="nan";
       one.name="hdf";
    
        System.out.println(two.name);
    }
}*/


/*class Animal{
    void sound(){
        System.out.println("barking");

    }
}
class Dog extends Animal{
    void eat(){
        sound();
        System.out.println("eating");
        

    }
}
public class Student{
    public static void main(String[]args){
        Dog onj =new Dog();
        onj.eat(); 
      
    }
}*/
PATTERN PROBLEM
import java.util.*;
public class Student{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}