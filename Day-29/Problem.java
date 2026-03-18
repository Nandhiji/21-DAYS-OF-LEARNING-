/*import java.util.*;
class Problem{
    public static void main(String[]args){
      /*  Scanner sc=new Scanner(System.in);
       
        //int largest=0;
      //  int sum=0;
      int count=0;
      int n=sc.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        
      /*  for(int i=0;i<n;i++){
            int x=sc.nextInt();
        
           for(int i=0;i<n;i++)
        }
        System.out.println(sum);*/

     /*   for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(largest<x){
                largest=x;
            }

        }
        System.out.println(largest);
        for (int i=0;i<n;i++){
        int x=sc.nextInt();
            if(x%2==0){

                count++;
            }
        }
        System.out.println(count);

              
              ArrayList <Integer> list = new ArrayList<>();

             Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    int x=sc.nextInt();
                    list.add(x);
                }

                for(int i=0;i<list.size();i++){
                    if(list.get(i)<10){
                        list.remove(i);
                        i--;
                    }
                }

                System.out.println(list);
                
          }
        }
        */

       //STUDENT MARK SYSTEM:
import java.util.*;
class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int ave=0;

    ArrayList <Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
        int marks=sc.nextInt();
        list.add(marks);   
    }

for(int i=0;i<list.size();i++){
        if(list.get(i)<35){
            list.remove(i);
            i--;
        }
}


int sum=0;

for(int i=0;i<list.size();i++){

    sum+=list.get(i);
}
int max=list.get(0);
for(int i=0;i<list.size();i++){
    if(max<list.get(i)){
        max=list.get(i);
    }

}
System.out.println("highest marks:"+max);
System.out.println("passed students:"+list);
    System.out.println("average:"+sum/list.size());
  
    
}
}


    

