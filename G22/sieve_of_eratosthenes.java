//O(n log(log n))
import java.util.*;

//all prime no. upto n

// public class sieve_of_eratosthenes {
// static final int n=50;
// static boolean[] isPrime = new boolean[50];
//     public static void main(String[] args) {
//         Arrays.fill(isPrime,true);
//         isPrime[0]=isPrime[1]=false;
//         for (int i = 2; i < n; i++) {
//             if(isPrime[i]==true){
//                 for (int j = 2*i; j < n; j+=i) {
//                     isPrime[j]=false;
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             if(isPrime[i]==true){
//                 System.out.println(i+" Prime");
//             }
//         }
//     }
// }



//-----------------------------------------------------------------------------------------------
//lowest and highest prime

// public class sieve_of_eratosthenes {
//     static final int n=50;
//     static boolean[] isPrime = new boolean[n];
//     static int[] lp = new int[n];
//     static int[] hp = new int[n];
//         public static void main(String[] args) {
//             Arrays.fill(isPrime,true);
//             isPrime[0]=isPrime[1]=false;
//             for (int i = 2; i < n; i++) {
                
//                 if(isPrime[i]==true){
//                     lp[i]=hp[i]=i;
//                     for (int j = 2*i; j < n; j+=i) {
//                         isPrime[j]=false;
//                         if(lp[j]==0){
//                             lp[j]=i;
//                         }
//                         hp[j]=i;
//                     }
//                 }
//             }
//             for (int i = 0; i < n; i++) {
//                 System.out.println(i+" lp: " + lp[i] + " hp: " + hp[i]);
//             }
//         }
//     }



//-------------------------------------------------------------------------------------------------------
//prime factors of a spcific number
public class sieve_of_eratosthenes {
    static final int n=50;
    static boolean[] isPrime = new boolean[n];
    static int[] lp = new int[n];
    static int[] hp = new int[n];
    public static void main(String[] args) {
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for (int i = 2; i < n; i++) { 
            if(isPrime[i]==true){
                for (int j = 2*i; j < n; j+=i) {
                    isPrime[j]=false;
                    if(lp[j]==0){
                        lp[j]=i;
                    }
                    hp[j]=i;
                }
            }    
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.println(i+" lp: " + lp[i] + " hp: " + hp[i]);
        // }
        System.out.println("prime factors of each nos are:");
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();
        for(int i=2;i<n;i++){
            System.out.print("i="+i+":");
            while(num>1){
                System.out.print(lp[num]);
                num/=lp[num];
            }
            System.out.println();
            // System.out.println();
        }
    }
}