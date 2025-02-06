import java.util.ArrayList;
import java.util.*;

public class Rabin_Karp {
    static final int d =256;
    public static void main(String[] args) {
        String str = "ancjbabcjdvkaabcnksdnlabckaabc";
        String pat = "abc";

        ArrayList<Integer> arr = new ArrayList<>();
        int prime = 101;
        match(str,pat,prime,arr);
        for(int x:arr){
            System.out.println("match found at:"+x);
        }
    }
    
    private static void match(String str, String pat, int prime, ArrayList<Integer> arr) {
        int patlen = pat.length();
        int strlen = str.length();
        int strhash=0;
        int pathash=0;
        int h=1;
        for (int i = 0; i < patlen-1; i++) {
            h=(h*d)%prime;
        }
        for(int i=0;i<patlen;i++){
            pathash=(d*pathash+pat.charAt(i))%prime;
            strhash=(d*strhash+str.charAt(i))%prime;
        }

        for (int i = 0; i <=(strlen-patlen); i++) {
            if(strhash==pathash){
                arr.add(i);
            }
            if(i<strlen-patlen){
                strhash=(d*(strhash-str.charAt(i)*h)+str.charAt(i+patlen))%prime;
            if(strhash<0){
                strhash+=prime;
            }
            }
            
        }
    }
}
