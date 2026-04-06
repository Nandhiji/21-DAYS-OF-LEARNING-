//sum of the digit (string to convert int and then calculate the sum)
/*import java.util.*;
class P{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sum=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int n=ch-'0';
        sum+=n;
       }
       System.out.println(sum);
        }
    }
  
    */
  /* longest word in a sentence 
import java.util.*;
   class P{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]  words=s.split(" ");
             String longest=words[0];
        for(int i=0;i< words.length;i++){
            if(words[i].length() > longest.length()){
                longest=words[i];
            }
        }
        System.out.println(longest);
    }
   }
   */
/*
  check anagram program:
import java.util.*;
class P{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        if(s1.length() != s2.length()){
            System.out.println("no");
            return;
        }
        int[] count= new int[26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            count[ch- 'a']++;
        }

        for(int i=0;i< s2.length();i++){
            char ch=s2.charAt(i);
            count[ch-'a']--;
        }

        for(int i=0;i<26;i++){
            if(count[i]!=0){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");

    }
}
*/