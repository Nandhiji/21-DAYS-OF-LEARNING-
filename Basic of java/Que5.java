
import java.util.*;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] logos=new String[n];
        int totalerror=0;
        int firststreak=0;
        int largeststreak=0;
        for(int i=0;i<n;i++){
            logos[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            if(logos.equals("ERROR")){
                totalerror++;
                firststreak++;
            }
            if(firststreak>largeststreak){
                largeststreak=firststreak;
            }
            else{
                firststreak=0;
            }
        }
        
        System.out.println("totalerrors:"+ totalerror);
        System.out.println("langeststreak"+largeststreak);
        System.out.println("firststreak:"+firststreak);
    }
    }
