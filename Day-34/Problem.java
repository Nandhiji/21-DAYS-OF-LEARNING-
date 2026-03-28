//first non repeating word:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<String, Integer> map=new HashMap<>();
        String[] word=str.split(" ");
        for(String words: word){
            if(map.containsKey(words)){
            map.put(words, map.get(words)+1);
            }
            else{
                map.put(words,1);
            }
        }
        for(String words:word){
            if(map.get(words)==1){
              
                System.out.println(words);

            }
        }

    }
}

//largest number:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=arr[0];
        for (int i = 0; i <n; i++) {
            if(arr[i]> largest){
                largest=arr[i];

            }
        }
            System.out.println(largest);
          
        }

    }
    

  // reverse a number:
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int lastd=n%10;
            reverse=reverse*10+ lastd;
            n=n/10;
        }
        System.out.println(reverse);
    }
}
