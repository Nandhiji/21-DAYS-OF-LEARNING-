/*
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
        for(Map.Entry<String, Integer> e: map.entrySet()){
            
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}*/

import java.util.*;
public class Problem{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        HashMap<String,Integer> map=new HashMap<>();
        String[] words =str.split(" ");

    for(String key: map.keySet()){
        if(map.containsKey(words)){
            count++;
        }
        else{
            count=1;
        }
    }
    System.out.println(count);
    }
}