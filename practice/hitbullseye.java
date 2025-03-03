import java.util.*;

public class hitbullseye {
    public static int[] compute_ans(int T, int[][] cases) {
        //Write your code here
        int[] res = new int[T];
        for(int ll=0;ll<T;ll++){
            int x = cases[ll][0];
            int y = cases[ll][1];
            int n = cases[ll][2];
            int[] arr = new int[n];
            int m = cases[ll][3];
            arr[0]=x;
            arr[1]=y;
            for(int i=2;i<n;i++){
                arr[i] = (arr[i-1]+arr[i-2])%m;
            }
            Arrays.sort(arr);
            Map<Integer, Integer> hm = new HashMap<>();
            for(int num:arr){
                hm.put(num, hm.getOrDefault(num,0)+1);
            }
            
            int sum=0;
            for(int count : hm.values()){
                sum+=count*count;
            }
            res[ll]=sum;
        }
        return res;
    }

    //Do not edit this part of code 
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[][] cases = new int[T][4];
        for (int i = 0; i < T; i++) {
            cases[i][0] = scanner.nextInt();
            cases[i][1] = scanner.nextInt();
            cases[i][2] = scanner.nextInt();
            cases[i][3] = scanner.nextInt();
        }

        int[] results = compute_ans(T, cases);
        for (int i = 0; i < T; i++) {
            System.out.println(results[i]);
        }
    }
}
