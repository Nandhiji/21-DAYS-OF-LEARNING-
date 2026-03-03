/*public class Over{


INSTANCE METHOD:

     void laptop(){
        System.out.println("hi");
    }
    public static void main(String[]args){
        Over obj=new Over();
        obj.laptop();

    }


    STATIC METHOD:
    
    static void laptop(){
        System.out.println("hi");
    }
    public static void main(String[]args){
        laptop();
    }
}*/

/*SHOP BUILDING SYSTEM:

public class Over{
    static int calculateTotal(int price, int quantity){
        return a+b;
    }
   static  double  applyDiscount(int total,double percentage){
    double discount=(total* percentage)/100;
    return (total)- (discount);
    }
   
    public static void main(String[]args){
       int total= calculateTotal(5,10);
       double finalamount=applyDiscount(total,10);

       System.out.println("final amount:"+finalamount);
    }
}*/


FACTORIAL NUMBER:
public class Over{
     static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[]args){
        int result=factorial(5);
        System.out.println(result);
    }
}