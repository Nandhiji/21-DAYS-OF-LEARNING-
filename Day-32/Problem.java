
import java.util.*;

public class Problem{
    public static void main(String[]args){
        HashMap<String,Integer> map=new HashMap<>();
       /* map.put("A",1 );
        map.put("B",3);
        map.put("A",4);
        map.remove("A");
    System.err.println(map);
        System.out.println(map.get("A"));
            map.put("A",1);
            map.put("B",3);
            map.put("A",4);

            for(String key: map.keySet()){
                System.out.println(key + ": " + map.get(key));
            }

        for(Map.Entry<String, Integer> e: map.entrySet()){
            
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}*/

WORD FREQUENCY COUNTER PROBLEM: 
import java.util.*;
public class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
        HashMap<String,Integer> map=new HashMap<>();
        
String[] words =str.split(" ");
    for(String word: words){
        if(map.containsKey(word)){
           map.put(word,map.get(word)+1);
        }
        else{
          map.put(word,1);
        }
    }
    for(String key: map.keySet()){
        System.err.println(key+":" + map.get(key));

    }
    }
}
