/*triangle 1

n=4
*
**
***
****

*/

// import java.util.Scanner;

// public class patterns {
//     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }

//--------------------------------------------------------------------------------------------------------------------------------
/* triangle 2

n=4
****
***
**
*


*/

//method 1:

// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=n;j>i;j--){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }

//method 2:

// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println( );
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------
//traigle 3

/*

n=4

   *
  **
 ***
 ****
 
 */
//Method 1:

// import java.util.Scanner;
// public class patterns {
    //     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i=0;i<n;i++){
    //             for(int j=i;j<n-1;j++){
//                 System.out.print(" ");
//             }
//             for(int j=0;j<=i;j++){
    //                 System.out.print("*");
//             }
//             System.out.println();
//         }            
//            
//     }
// }


//Method 2:

// import java.util.Scanner;
// public class patterns {
    //     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int space=n-1;
//         int star=1;
//         for(int i=1;i<=n;i++){
//             // System.out.print(space+", "+star);
//             for(int j=1;j<=space;j++){
    //                 System.out.print(" ");
    //             }
    //             for(int k=1;k<=star;k++){
//                 System.out.print("*");
//             }
//             space--;
//             star++;
//             System.out.println();
//         }




//     }
// }
//-------------------------------------------------------------------------------------------------------------------------------------
//traigle 4
/*

n=4

****
***
**
*

*/

//Method 1:


// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=n;k>=i;k--){
    //                 System.out.print("*");
    //             }
//             System.out.println();
//         }
//     }
// }


//Method 2:


// import java.util.Scanner;
// public class patterns {
    //     public static void main( String[] args) {
        //         Scanner scn = new Scanner(System.in);
        //         int n = scn.nextInt();
        //         int space=0;
//         int star=n;
//         for(int i=1;i<=n;i++){
    //             // System.out.print(space+", "+star);
    //             for(int j=1;j<=space;j++){
        //                 System.out.print(" ");
        //             }
        //             for(int k=1;k<=star;k++){
            //                 System.out.print("*");
            //             }
            //             space++;
            //             star--;
            //         System.out.println( );
            //         }
            
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------
//Diamond

/*

n=5

  *
 ***
*****
 ***
  *
  

*/


// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
    //         Scanner scn = new Scanner(System.in);
    //         int n = scn.nextInt(); 
//         int space=n/2;
//         int star=1;
//         for(int i=1;i<=n;i++){
    //             //System.out.println(space+", "+star);

    //             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=star; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//             if(i<=(n/2)){
    
//                 space--;
//                 star+=2;
//             }
//             else{
    
//                 space++;
//                 star-=2;
//             }
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------------------
//Hollow Diamond
/*

n=5

*** ***
**   **
*     *
**   **
*** ***


*/

// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
    //         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int space=1;
//         int star=(n/2)+1;
//         for(int i=1;i<=n;i++){
//             // System.out.println(star1+", "+space+", "+star2);
//             for(int j=1;j<=star;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=star;j++){
//                 System.out.print("*");
//             }

//             if(i<=(n/2)){
//                 star--;
//                 space+=2;
//             }
//             else{
    //                 star++;
    //                 space-=2;
//             }
//             System.out.println( );
//         }
//     }
// }


//-------------------------------------------------------------------------------------------------------------------------------------
//row?

/*


n=5

*
 *
  *
   *
    *


*/

//Method 1: 

// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt(); 
//         int star=1;
//         int space=0;
//         for(int i=1;i<=n;i++){
    //             // System.out.println(space+", "+star);
            
//             for(int j=1;j<=space;j++){
//                 System.out.print(" ");
//             }
//             System.out.print("*");
//             System.out.println();
//             space++;
//         }
//     }
// }


//Method 2:

// import java.util.Scanner;
// public class patterns {
    //     public static void main( String[] args) {
        //         Scanner scn = new Scanner(System.in);
        //         int n = scn.nextInt(); 
        //         int star=1;
        //         int space=0;
        //         for(int i=1;i<=n;i++){
            //             // System.out.println(space+", "+star);
            //             for(int j=1;j<=n;j++){
                //                 if(i==j){
                    //                     System.out.print("*");
                    //                 }
                    //                 else{
                        //                     System.out.print(" ");
                        //                 }
                        //             }
                        //             System.out.println();
                        //             space++;
                        //         }
                        //     }
                        // }
                        
                        
//-------------------------------------------------------------------------------------------------------------------------------------
//opposite-row?
/*

n=5

*
*
*
*
*


*/

//Method 1:

// import java.util.Scanner;
// public class patterns {
    //     public static void main( String[] args) {
        //         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt(); 
//         int star=1;
//         int space=n-1;
//         for(int i=1;i<=n;i++){
    //             // System.out.println(space+", "+star); 
    //             for(int j=1;j<=space;j++){
        //                 System.out.print(" ");
//             }
//             System.out.print("*");
//             System.out.println();
//             space--;
//         }
//     }
// }

//Method 2

// import java.util.Scanner;
// public class patterns {
//     public static void main( String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt(); 
//         int star=1;
//         int space=0;
//         for(int i=1;i<=n;i++){
//             // System.out.println(space+", "+star);
//             for(int j=1;j<=n;j++){
//                 if(i+j==n+1){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//             space++;
//         }
//     }
// }
                        
                        
//-------------------------------------------------------------------------------------------------------------------------------------
// X pattern

//n=5
/*

n=5

*   *
* *
  *
 * *
 *   *
 

*/


// import java.util.Scanner;
// public class patterns {
    //         public static void main( String[] args) {
        //                 Scanner scn = new Scanner(System.in);
        //         int n = scn.nextInt(); 
        
//         for(int i=1;i<=n;i++){
    //             // System.out.println(space+", "+star); 
//             for(int j=1;j<=n;j++){
//                 if(i==j||i+j==n+1){
    //                     System.out.print("*");
    //                 }
//                 else{
    //                     System.out.print(" ");
    //                 }
    //             }
    //             System.out.println();
    
    //         }
    //     }
    // }
    
    
//-------------------------------------------------------------------------------------------------------------------------------------
// Hollow rhombus

/*

n=5

*
* *
*   *
* *
*

*/


// import java.util.Scanner;
// public class patterns {
    //         public static void main( String[] args) {
//                 Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt(); 
//         int os=n/2;
//         int is=-1;
//         for(int i=1;i<=n;i++){
    //                 // System.out.println(os+", "+is); 
    //             for(int j=1;j<=os;j++){
        //                 System.out.print(" ");
        //             }
        //             System.out.print("*");
//             for(int j=1;j<=is;j++){
//                 System.out.print(" ");
//             }
//             if(i>1 && i<n){
    //                 System.out.print("*");
    //             }
    //             if(i<=n/2){
//                 os--;
//                 is+=2;
//             }
//             else{
    //                 os++;
    //                 is-=2;
    //             }
    
    //             System.out.println();
    
    //         }
    //     }
    // }
    
    
//-------------------------------------------------------------------------------------------------------------------------------------
// increasing number 
/*
 
n=4

1
2 3
4 5 6
7 8 9 10


*/




import java.util.Scanner;
public class patterns {
    public static void main( String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); 
        int start=0;
        int second=1;
        for(int i=1;i<=n;i++){
            // System.out.println(space+", "+star);
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                int sum=start+second;
                second=start;
                start=sum;
            }
            System.out.println();

        }
    }
}
  