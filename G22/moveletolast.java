//input: str: "abcbabbcdbc" ele: "b"
//output: "acacdcbbbbb"

public class moveletolast {
    public static void main(String[] args) {
        String str = "abcbabbcdbc";
        char ele = 'b';
        String out = "";
        solve(str, out, ele, 0);
    }
    static int count=0;
    private static void solve(String str, String out, char ele, int i){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                out+=ele;
            }
            System.out.println(out);
            return;
        }
        if(str.charAt(i)==ele){
            count++;
            solve(str, out, ele, i+1);
        }
        else{
            out+=str.charAt(i);
            solve(str, out, ele, i+1);
        }
        
    }
}
