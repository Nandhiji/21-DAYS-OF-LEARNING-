/*import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int largest=arr[0];
        int secondlargest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondlargest  && arr[i]!=largest){
                secondlargest=arr[i];
            }
            //System.out.println(secondlargest);
        }   
        System.out.println(secondlargest);
        }}
        */
/*
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word=sc.nextLine();
        String[] words=word.split(" ");
        for(int i=words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
    }
}
*/
/*
import java.util.*;
 class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            System.out.println("not prime");
        

        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("not prime");
            }
        }
        }
        else{
            System.out.println("prime");
        }
    }
}*/
/*
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int original=n;
        while(n>0){
            int lastd=n%10;
            reverse=reverse*10+lastd;
            
            n=n/10;
        }
        //System.out.println(reverse);
        if(reverse==original){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }
    }
}
*/
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int countod=0;
        int countev=0;
       
        while(n>0){
            int lastd=n%10;
        if(lastd%2==0){
            countev++;
        }
        else {
            countod++;
        }
        n=n/10;
        }
        System.out.println(countev);
        System.err.println(countod);
    }

}
