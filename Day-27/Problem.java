
import java.io.IOException;
class Student{
    void name() throws IOException{
        throw new ArithmeticException("name is not valid");
    }
}
public class Problem{
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.name();
        } catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
    }
}