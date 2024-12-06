// import java.sql.Array;
// import java.util.Arrays;
// //sorting
// public class Arrays_basics {
//     public static void main(String[] args) {
//         // Scanner scn = new Scanner(System.in);
//         // int n=scn.nextInt();
//         int[] arr={1,2,3,4,5,6,-7,-8,-9,-10};
//         int n=arr.length;
//         int[] temp = new int[n];
//         int i=0,j=n-1;
//         for(int k=0;k<n;k++){
//             if(arr[k]%2!=0){
//                 temp[k++]=arr[k];
//             }
//             else{
//                 temp[j--]=arr[k];
//             }
//         }
//         Arrays.sort(arr,0,i);
//         Arrays.sort(arr,i,n);
//         System.out.println(Arrays.toString(arr));
//     }
// }

//---------------------------------------------------------------------------------------------
//Rotate by K elements

// public class Arrays_basics {
// public static void main(String[] args) {
//     int[] arr={1,2,3,4,5,6,7};
//     int n=arr.length;
//     int k=2;
//     int[] temp = new int[k] ;
//     for(int i=0;i<k;i++){
//         temp[i]=arr[i];
//     }
//     for(int i=0;i<n-k;i++){
//         arr[i]=arr[i+k];
//     }
//     for(int i=n-k;i<n;i++){
//         arr[i]=temp[i-n+k];
//     }
//     for(int i=0;i<n;i++){
//         System.out.print(arr[i]+" ");
//     }
    
// }
// }

//------------------------------------------------------------------------------------------------------------------
//print array with unique elemnts
//remove duplicates




import java.sql.Array;
import java.util.Arrays;

public class Arrays_basics {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int n=scn.nextInt();
        int[] arr={1,1,2,2,3,4,4,4};
        int n=arr.length;
        int[] temp = new int[n];
        int i=0;
        for(int k=1;k<n;k++){
            if(arr[i]!=arr[k]){
                i++;
                arr[i]=arr[k];
            }
        }
        int len=i+1;
        // for (int k = 0; k < len; k++) {
            System.out.print(Arrays.toString(Arrays.copyOfRange(arr,0,len)));
        // }
    }
}


//---------------------------------------------------------------------------------------------------------------------
//majority element
//moores voting alg

// import java.sql.Array;
// import java.util.Arrays;

// public class Arrays_basics {
//     public static void main(String[] args) {
//         // Scanner scn = new Scanner(System.in);
//         // int n=scn.nextInt();
//         int[] arr={3,3,4,2,4,4,4,4,5,3};
//         int count=0;
        
//         int x=arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if(count==0){
//                 x=arr[i];
//                 count=1;
//             }
//             else if(x==arr[i]){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//         }
//         System.out.println(x);
//     }
// }

//------------------------------------------------------------------------------------------------
//Max sum of a Subarray

// public class Arrays_basics {
// public static void main(String[] args) {
//     int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
    
// }
// }

//----------------------------------------------------------------------------------------------------------------------
//seconds conversion

// import java.util.Scanner;

// public class Arrays_basics {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int hours=00;
//     int min=00;
//     int sec=00;
//     if((n/3600)!=0){
//         hours = n / 3600;
//         n = n%3600;
//     }
//     if((n/60)!= 0 ){
//         min = n / 60;
//         n = n%60;
//     }
//     if(n!=0){
//         sec=n;
//     }
//     if(hours<10){
//         System.out.print("0"+hours+":");
//     }
//     else{
//         System.out.print(hours+":");
//     }
//     if(min<10){
//         System.out.print("0"+min+":");
//     }
//     else{
//         System.out.print(min+":");
//     }
//     if(sec<10){
//         System.out.print("0"+sec);
//     }
//     else{
//         System.out.print(sec);
//     }
    
// }
// }

//----------------------------------------------------------------------------------------------


// class ABC {

    
// }
// public class Arrays_basics {
// public static void main(String[] args) {
//     int a=10;
//     int b=10;
//     ABC obj = new ABC();
//     System.out.println(obj);
// }
// }

