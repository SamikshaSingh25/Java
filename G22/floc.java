//first and last occurence of character
import java.util.*;
public class floc {
    public static void main(String[] args) {
        String str = "abcdabcdabcacbd";
        char ele = 'a';
        solve(str,ele,0);
    }

    static int fo=-1,lo=-1;
    private static void solve(String str, char ele, int i){
        int n=str.length();
        if(i==n){
            System.out.println(fo+" "+lo);
            return;
        }
        if(str.charAt(i)==ele){
            if(fo==-1){
                fo=i;
            }
            lo=i;
        }
        
        solve(str,ele,i+1);
        
    }
}
