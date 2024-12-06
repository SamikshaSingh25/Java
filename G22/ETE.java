import java.util.*;

public class ETE {
    //pattern
    // public static void pattern(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=i;j>0;j--){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //check if s2 comes at the end of s1  eg: s2=ace, s1=face
    // public static int check(String s1, String s2){
    //     // int i=s1-s2;
    //     if(s1.length() < s2.length()){
    //         return 0;
    //     }
    //     int i = s1.length() - s2.length();
    //     int j=0;
    //     while(i<s1.length() && j<s2.length()){
    //         if(s1.charAt(i)!=s2.charAt(j)){
    //             return 0 ;
    //         }
    //         i++;
    //         j++;
    //     }
    //     return 1;
        
    // }


    //return 2nd lagest element but if all the elemnets in the array are same or the 2nd largest is -ve return 0;
    // public static int secondlar(int[] arr){
    //     Arrays.sort(arr);
    //     int k=arr.length;
    //     int j = arr[k-1]; //largest
    //     for(int i = arr[k-2] ; i>0;i--){
    //         if(arr[i]!= j){
    //             if(arr[i]<0){
    //                 return 0;
    //             }
    //             else{
    //                 return arr[i];
    //             }
    //         }    
    //     }
    //     return 0;

    // }

    //convert into binary and return count of 1
    // public static int bin(int n){
    //     int power = 1;
    //     int b=0;
    //     while(n>0){
    //         int dig = n%2;
    //         n=n/2;
    //         b = b + (dig*power);
    //         power*=10;
    //     }
    //     int c=0;
    //     while(b>0){
    //         int digi = b%10;
    //         if(digi==1){
    //             c++;
    //         }
    //         b/=10;
    //     }
    //     return c;
    // }

    // public static void pat(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=i;j<n;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
        
    // }

    //starting substring
    // public static int check(String s1,String s2){
    //     for(int i=0;i<s2.length();i++){
    //         if(s1.charAt(i)!=s2.charAt(i)){
    //             return 0;
    //         }
    //     }
    //     return 1;
    // } 

    //sum of uncommon 
    // public static int unsum(int[] arr1 , int[] arr2){
    //     int sum1=0;
    //     int sum2=0;
    //     // int sum=0;
    //     for(int i=0;i<arr1.length;i++){
    //         sum1+=arr1[i];
    //     }
    //     for(int i=0;i<arr2.length;i++){
    //         sum2+=arr2[i];
    //     }
    //     int sum = Math.abs(sum1-sum2);
    //     // int res = Math.abs(sum);
    //     return sum;
    // }

    public static int same(int n , int m ){
        int power1=1;
        int power2=1;
        int bin1=0;
        int bin2=0;
        while(n>0){
            int dig1 = n%2;
            n/=2;
            bin1+= dig1*power1;
            power1*=10;
        }
        while(m>0){
            int dig2 = m%2;
            m/=2;
            bin2+= dig2*power2;
            power2*=10;
        }
        int count=0;
        while (bin2>0||bin1>0) {
            int d1 = bin1%10;
            int d2 = bin2%10;
            if(d1==d2){
                count++;
            }
            bin1/=10;
            bin2/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        //print pattern 
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // pattern(n);

        //substring at end
        // String s1 = scn.next();
        // String s2= scn.next();
        // System.out.println(check(s1,s2));

        // //2nd largest
        // int n = scn.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = scn.nextInt();
        // }
        // System.out.println(secondlar(arr));

        // int n =scn.nextInt();
        // pat(n);

        //uncommon sum
        // int n = scn.nextInt();
        // int m = scn.nextInt();
        // int[] arr1 = new int[n];
        // int[] arr2 = new int[m];
        // for(int i=0;i<n;i++){
        //     arr1[i] = scn.nextInt();
        // }
        // for(int i=0;i<m;i++){
        //     arr2[i] = scn.nextInt();
        // }

        //binary same digit
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(same(n,m));
    }
}
