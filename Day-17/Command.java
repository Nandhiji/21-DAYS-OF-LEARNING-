//COMMAND LINE ARGUMENTS:

/*public class Command{
    public static void main(String[]args){
        int a= Integer.parseInt(args[0]);
        System.out.println(a);
    }
}*/

// WRAPPER CLASS:  integer to string conversion
/*public class Command{
    public static void main(String[]args){
        int a=45;
       String b=Integer.toString(a);
       System.out.println(b);

    }
}*/
/*String to int conversion with multiple by 2:

public class Command{
    public static void main(String[]args){
        String a="34";
        int b=Integer.parseInt(a);
        System.out.println(b*2);
    }
}*/

// EXCEPTION HANDLIND

public class Command{
    public static void main(String[]args){
        try{
            int a=10;
            int b=0;
            int result=a/b;

            System.out.println(result);
        }
        catch(Exception e){
            System.out.println("error occured");

        }
    }
}
