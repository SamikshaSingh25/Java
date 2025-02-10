import java.util.ArrayList;

public class Longest_Prefix_Suffix {
    public static void main(String[] args) {
        String txt = "abctysabcdetfghjkancd";
        String pattern="abcd";
        ArrayList <Integer> arr = new ArrayList<>();
        arr = search(txt,pattern);
        System.out.println(arr.toString());
    }
    private static ArrayList<Integer> search(String txt, String pattern) {
        int[] lps = compute(pattern);
        return null;
                
    }
    private static int[] compute(String pattern) {
        int M = pattern.length();
        int[] lps = new int[M];
        lps[0]=0;
        int length=0;
        int i=1;
        while(i<M){
            if(pattern.charAt(i)==pattern.charAt(length)){
                length++;
                lps[i]=length;
                i++;
            }
            else{
                if(length!=0){
                    length=lps[length-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return null;
    }
           
}
