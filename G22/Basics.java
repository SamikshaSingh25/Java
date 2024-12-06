//EVEN ODD

// import java.util.Scanner;

// public class Basics {
//     public static void main(String[] args) {
//         System.out.println("Enter a number:");
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         // if (n%2==0) {
//         if ((n&1)==0) {
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }


//     }
// }


//----------------------------------------------------------------------------------------------------------------
//LEAP YEAR

// import java.util.Scanner;

// public class Basics {
    //     public static void main(String[] args) {
        //         System.out.println("Enter an year:");
        //         Scanner scn = new Scanner(System.in);
        //         int n = scn.nextInt();
        
        //         if ((n%400==0) || (n%4==0 && n%100!=0)) {
            //             System.out.println("leap year");
            //         }
            
            //         else{
//             System.out.println("not leap year");
//         }


//     }
// }

//----------------------------------------------------------------------------------------------------------------
//PRIME NUMBER

// import java.util.Scanner;

// public class Basics {
//         public static void main(Strings[] args) {
//                 System.out.println("Enter a num:");
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 boolean isPrime = true;
//                 int count=0;
//                 for (int i = 2; i < n; i++) {
//                     if(n%i==0){
//                         System.out.println("not prime");
//                         // count++;
//                         isPrime = false;
//                         break;
//                     }
                    
//                 }
//                 // if(count==0){
//                 //     System.out.println("prime");
//                 //}
//                 if(isPrime){
//                     System.out.println("prime");
//                 }
//     }
// }


//-------------------------------------------------------------------------------------------------
//factorial

import java.util.Scanner;

public class Basics{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int res=1;
        for(int i=1;i<=n;i++){
            res*=i;
        }
        System.out.println(res);
    }
}