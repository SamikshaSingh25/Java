public class Manekar {
    public static void main(String[] args) {
        String str = "abaxabd";
        String lps = lps(str);
        System.out.println(lps);
    }
    private static String lps(String str){
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        for(char x: str.toCharArray()){
            sb.append(x);
            sb.append("#");
        }
        String s = sb.toString();
        int[] p = new int[s.length()];
        int c=0,r=0;
        for(int i=0;i<s.length();i++){
            int m=2*c-i;
            if(i<r){
                p[i]=Math.min(p[m],r-i);
            }
            while(i+p[i]+1<s.length() && i-p[i]-1>=0 && s.charAt(i+p[i]+1)==s.charAt(i-p[i]-1)){
                p[i]++;
            }
            if(i+p[i]>r){
                c=i;
                r=i+p[i];
            }
        }
        int center = 0, maxLen=0;
        for(int i=1;i<p.length-1;i++){
            if(p[i]>maxLen){
                maxLen=p[i];
                center=i;
            }
        }
        int start=(center-maxLen)/2;

        return str.substring(start, start+maxLen);
    }
}
