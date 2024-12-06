//basic array making and printing

// public class Arrays {
// public static void main(String[] args) {
//     int[] arr = new int[5];
//     arr[0]=33;
//     arr[1]=47;
//     arr[2]=59;
//     arr[3]=67;
//     arr[4]=98;

//     // for (int i = 0; i < arr.length; i++) {
//     //     System.out.println(arr[i]);
//     // }

//     int[] two = arr;
//     two[2] = 590;
//     for (int i = 0; i < two.length; i++) {
//         System.out.println(arr[i]);
//     }
// }
// }

//-------------------------------------------------------------------------------------------------------------
//Span of an Array

// import java.util.Scanner;

// public class Arrays {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int[] arr = new int[n];
//     for (int i = 0; i < arr.length; i++) {
//         arr[i] = scn.nextInt();
//     }
//     int max=arr[0];
//     int min = arr[0];
//     for(int i=0;i<n;i++){
//         if(arr[i]>max){
//             max = arr[i];
//         }
//         if(arr[i]<min){
//             min=arr[i];
//         }

//     }
//     System.out.println(max-min);
// }
// }


//-------------------------------------------------------------------------------------------------------------
//Find element in an Array

// import java.util.Scanner;

// public class Arrays {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();
//     int[] arr = new int[n];
//     for (int i = 0; i < arr.length; i++) {
//         arr[i] = scn.nextInt();
//     }
//     int find = scn.nextInt();
//     int found =-1;
//     for(int i=0;i<n;i++){
//         if(arr[i]==find){
//             found=i;
//             break;
//         }
//     }
//     System.out.println(found);
// }
// }


//-------------------------------------------------------------------------------------------------------------
//Bar Chart

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scn.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         for (int floor = max; floor>=1; floor--) {
//             for (int i = 0; i < arr.length; i++) {
//                 if(arr[i]>=floor){
//                     System.out.print("*\t");
//                 }
//                 else{
//                     System.out.print("\t");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------------
//Sum of two arrays

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n1 = scn.nextInt();
//         int[] arr1 = new int[n1];
//         for (int i = 0; i < arr1.length; i++) {
//             arr1[i] = scn.nextInt();
//         }
//         int n2 = scn.nextInt();
//         int[] arr2 = new int[n2];
//         for (int i = 0; i < arr2.length; i++) {
//             arr2[i] = scn.nextInt();
//         }
//         int[] sum = new int[n1>n2 ? n1:n2];  //agar n1 > n2 toh n1 size ka varna n2 size ka
//         int c=0;
//         int i=arr1.length-1;
//         int j=arr2.length-1;
//         int k=sum.length-1;

//         while(k>=0){
//             int d=c;
//             if(i>=0){
//                 d+=arr1[i];
//             }
//             if(j>=0){
//                 d+=arr2[j];
//             }
//             c=d/10;
//             d=d%10;

//             sum[k]=d;
//             i--;
//             j--;
//             k--;
//         }
//         if(c!=0){
//             System.out.println(c);
//         }
//         for(int val: sum){ //direct value
//             System.out.println(val);
//         }

//     }
// }

//-------------------------------------------------------------------------------------------------------------
//Difference of two arrays

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        int[] diff =new int[n2] ; //question me given hai 2nd no. is bigger
        int c=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=diff.length-1;

        while(k>=0){
            int d=0;
            int arr1value = (i>=0)? arr1[i] : 0; //agar arr1 ke i ke value -1 ho chuke hai toh udhar 0 man lo 
            if(arr2[j]+c>=arr1value){
                d = arr2[j] + c - arr1value;
                c=0;
            }
            else{
                d = arr2[j] + c + 10 - arr1value ; //upar wala chota pad gaya 
                c=-1;
            }
            

            diff[k]=d;
            i--;
            j--;
            k--;
        }
        int idx=0;
        while(idx < diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }
        }
        while(idx < diff.length){
            System.out.print(diff[idx]);
            idx++;
        }

    }
}