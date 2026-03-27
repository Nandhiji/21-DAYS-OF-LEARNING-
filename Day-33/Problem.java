/*
remove duplicates
import java.util.*;
class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for(String word: words){
            set.add(word);
        }
        for(String s: set){
            System.err.println(s);
        }
    }
}*/
// count the frequency
import java.util.*;
 class Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] words=str.split(" ");
        LinkedHashSet<String> set=new LinkedHashSet<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String word:words){
            set.add(word);

            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        for(String Key:map.keySet() ){
            System.err.println(Key+ map.get(Key));
          
    }
}
 }