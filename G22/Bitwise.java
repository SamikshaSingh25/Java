//SWAP

// import java.util.Scanner;

// public class Bitwise {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter n:");
//         int n = scn.nextInt();
//         System.out.print("Enter m:");
//         int m = scn.nextInt();
//         n=n^m;
//         m=n^m;
//         n=n^m;
//         System.out.println("n is:"+ n);
//         System.out.println("m is:" +m);
//     }
// }


//------------------------------------------------------------------------------------------------
//Counting Set bits

// import java.util.Scanner;

// public class Bitwise {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter num:");
//         int n = scn.nextInt();
//         int count=0;
//         while(n>0){
//             count=count+(n&1);
//             n=n>>1;
//         }
//         System.out.println(count);
        
//     }
// }


//---------------------------------------------------------------------------------------------------
//Finding missing number


// import java.util.Scanner;

// public class Bitwise {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int[] arr={4,1,3,5};
//         int xorall=0;
//         int sumall=0;
//         for(int i=0; i<arr.length;i++){
//             xorall = xorall ^ arr[i];
//         }
//         for(int i=1; i<=arr.length+1;i++){
//             sumall=sumall ^ i;
//         }
//         int result = xorall^sumall;
//         System.out.println(result);
        
//     }
// }

//--------------------------------------------------------------------------------------------------------
//incrementing a number (adding 1 without plus operator)

// import java.util.Scanner;

// public class Bitwise {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("Enter num:");
//         int n = scn.nextInt();
//         int x=1;
//         while((n&x)!=0){
//             n=n^x;
//             x=x<<1;
//         }
//         int result=n^x;
//         System.out.println(result);
        
//     }
// }


//----------------------------------------------------------------------------------------------------
//number occuring for odd number of times


// import java.util.Scanner;

// public class Bitwise {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);

//         //1st part
//         int[] arr={1,1,2,2,3,5};
//         int xorofall=0;
//         for(int i=0;i<arr.length;i++){
//             xorofall=xorofall^arr[i];
//         }
//         System.out.println(xorofall);

//         //2nd part
//         int positionof1=0;
//         for (int i = 0; i < 32; i++) {
//             if((xorofall&(1<<i))>0){//leftshift
//                 positionof1=i;
//                 break;
//             }
//         }
//         System.out.println(positionof1);

//         //3rd part
//         int num1=0, num2=0;
//         for (int i = 0; i < arr.length; i++) {
//             if((arr[i]&(1<<positionof1))>0){
//                 num1=num1^arr[i];
//             }
//             else{
//                 num2=num2^arr[i];
//             }
//         }
//         System.out.println("num1: "+num1+"  num2: "+num2);
//     }
// }

//hw: decrement a number

//-----------------------------------------------------------------------------------------------------------------
//decrement

public class Bitwise {
public static void main(String[] args) {
    System.out.println("output of complement of 12(-12..to minus by 1): " + (~-12));
}
}