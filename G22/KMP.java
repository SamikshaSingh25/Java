import java.util.*;

public class KMP{
    public static void main(String[] args) {
        String txt = "abcdtysabcdetfghjkabcd";
        String pattern="abcd";
        ArrayList <Integer> arr = new ArrayList<>();
        arr = search(txt,pattern);
        System.out.println(arr.toString());
    }
    private static ArrayList<Integer> search(String txt, String pattern) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] lps = compute(pattern);
        int M = pattern.length();
        int N =txt.length();
        int i=0;
        int j=0;
        while(i<N){
            if(txt.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }
            if(j==M){
                arr.add(i-j);
                j=lps[j-1];

            }
            else if(i<N && (j==0 || txt.charAt(i)!=pattern.charAt(j))){
                if(j!=0){
                    j=lps[j-1];
                }
                else{
                    i++;
                }
            }
        }
        return arr;
                
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
        //System.out.println(Arrays.toString(lps));
        return lps;
    }
           
}
