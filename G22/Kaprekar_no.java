// //Kaprekar Number (jinke square ka number ka individual number ka sum number jaisa ho.. eg: 9^2 = 81 and 8+1=9)

// import java.util.Scanner;
// import java.util.*;

// public class Kaprekar_no {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n = scn.nextInt();

//     // System.out.println(kap(n));
//     kap(n);
// }

// // static boolean kap(int n) {
// static void kap(int n) {
//     if(n==1){
//         // return false;
//         return ;
//     }
//     int digits = String.valueOf(n).length();
//     int sqr=n*n;
//     for (int i = 1; i <= digits ; i++) {
//         int pow =(int)Math.pow(10, i);
//         if(n==pow){
//             // return false;
//             return ;
//         }
//         int sum = (sqr%pow)+(sqr/pow);
//         if(sum==n){
//             // return true;
//             System.out.println(sqr/pow + " " + sqr%pow);
//         }
//     }
//     // return false;
// }
// } 


//----------------------------------------------------------------------------------------------------------------
//Kaprekar Constant(6174)


import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;


public class Kaprekar_no {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    while(n!=6174){
       n=kap(n);    
       System.out.println(n);
    }
}

static int kap(int n) {
    
    String numStr = String.format("%4d",n);  //to always make sure the number is of 4 digits

    String ascStr = sort(numStr,true);   //ascending order;
    String decStr = sort(numStr,false);   //ascending order;

    int ascNum = Integer.parseInt(ascStr);
    int decNum = Integer.parseInt(decStr);

    return decNum - ascNum;

    //my logic was not quite right for java
    int digits = String.valueOf(n).length();
    int[] arr= new int[digits];
    for (int i = 0; i < digits; i++) {
        arr[i]= n%10;
        n=n/10;
    }
    Arrays.sort(arr);  
    // System.out.println(Arrays.toString(arr));  //coz func is now int not void and void doesn't return while int does
    int sum=0;
    int sum2=0;
    for (int i = 0; i < digits; i++) {
        sum=(sum*10)+arr[i];
    }
    Arrays.sort(arr,Collections.reverseOrder());
    System.out.println(Arrays.toString(arr));
    
    System.out.println(sum2);
}
static String sort(String numStr, boolean b) {
    char[] arr = numStr.toCharArray();
    Arrays.sort(arr);
    if(!b){
        reverse(arr);
    }
    return new String(arr);
}
public static void reverse(char[] arr) {  //void does not return
    int l=0;
    int r=arr.length-1;
    while(l<r){
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
    }
    
}
} 