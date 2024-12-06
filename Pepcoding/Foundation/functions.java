//nPr

// import java.util.Scanner;

// public class functions {

//     public static int fact(int x) {
//         int rv=1;
//         for (int i = 1; i <= x; i++) {
//             rv=rv*i;
//         }
//         return rv;
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int n=scn.nextInt();
//         int r=scn.nextInt();
//         int nfact=fact(n);
//         int nmrfact=fact(n-r);
//         // int nfact=1;
//         // for (int i = 1; i <= n; i++) {
//         //     nfact*=i;
//         // }
//         // int nmrfact=1;
//         // for (int i = 1; i <= n-r; i++) {
//         //     nmrfact*=i;
//         // }
//         int npr=nfact/nmrfact;
//         System.out.println(n+"P"+r+"="+npr);
//     }
// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Frequency of digits


// import java.util.Scanner;

// public class functions {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int d=scn.nextInt();
//     int f=getDigitFreq(n,d);
//     System.out.println(f);
// }

// public static int getDigitFreq(int n,int d){
    //     int rv=0;
    //     while(n>0){
//         int dig=n%10;
//         n=n/10;
//         if(dig == d){
    //             rv++;
//         }
//     }
//     return rv;
// }
// }


//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Decimal to any base


// import java.util.Scanner;
// public class functions {
    
//     public static int conversion(int num, int base) {
//         int result=0;
//         int power=1;
//         while(num>0){
//             int dig = num % base;  //num ko base ke powers me represent karna hai 
//             num=num/base;
//             result=result + (dig*power);
//             power=power*10;
//         }
//         return result;
//     }
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int b=scn.nextInt();
//     int dn= conversion(n, b);
//     System.out.println(dn);

// }
// }

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Any base to Decimal


// import java.util.Scanner;
// import java.lang.Math;

// public class functions {
    
//     public static int conversion(int num, int base) {
//         int result=0;
//         int power=1;
//         while(num>0){
//             int dig = num % 10;  //num ko base ke powers me represent karna hai 
//             num=num/10;
//             result=result + dig*power;
//             power=power*base;
//         }
//         return result;
//     }
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int b=scn.nextInt();
//     int dn= conversion(n, b);
//     System.out.println(dn);

// }
// }




//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Any base to Any Base


// import java.util.Scanner;
// import java.lang.Math;

// public class functions {
    
//     public static int anybasetodecimal(int num, int base) {
//         int result=0;
//         int power=1;
//         while(num>0){
//             int dig = num % 10;  //num ko base ke powers me represent karna hai 
//             num=num/10;
//             result=result + dig*power;
//             power=power*base;
//         }
//         return result;
//     }
//     public static int decimaltoanybase(int num, int base) {
//                 int result=0;
//                 int power=1;
//                 while(num>0){
//                     int dig = num % base;  //num ko base ke powers me represent karna hai 
//                     num=num/base;
//                     result=result + (dig*power);
//                     power=power*10;
//                 }
//                 return result;
//             }
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int b1=scn.nextInt();
//     int b2=scn.nextInt();
//     int dn1= anybasetodecimal(n, b1);
//     int dn2= decimaltoanybase(dn1, b2);
//     System.out.println(dn2);

// }
// }





//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Any base addition


// import java.util.Scanner;
// import java.lang.Math;

// public class functions {
    
//     public static int anybaseadd(int b, int n1, int n2){
//         int result=0;
//         int c=0;
//         int p=1;
//         while(n1>0||n2>0||c>0){
    //             int d1=n1%10;
    //             int d2=n2%10;
    //             n1=n1/10;
    //             n2=n2/10;
    //             int d=d1+d2+c;
    //             c=d/b;  //agar example..8 base hai carry is remainder
    //             d=d%b;  //this is quotient 
    
    //             result+=d*p;
    //             p=p*10; 
    //         }
    
    //         return result;
    //     }
    
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int b=scn.nextInt();
//     int n1=scn.nextInt();
//     int n2=scn.nextInt();
//     int d= anybaseadd(b,n1,n2);
//     System.out.println(d);

// }
// } 

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Any base addition


// import java.util.Scanner;
// import java.lang.Math;

// public class functions {
    
//     public static int anybasesub(int b, int n1, int n2){
//         int result=0;
//         int c=0;
//         int p=1; 
//         while(n2>0){
//                 int d1=n1%10;
//                 n1=n1/10;
//                 int d2=n2%10;
//                 n2=n2/10;
                
//                 int d=0; //ye vo digit banan hai 
//                 d2=d2+c;
//                 if(d2>=d1){
//                     c=0; //reset carry
//                     d=d2-d1;
//                 }
//                 else{
//                     c=-1; //because carry was borrowed
//                     d=d2+b - d1; //because carry toh ja krr 8*1 hota hai...actually base*1
//                 }

//                 result+=d*p;
//                 p=p*10; 
//             }
    
//             return result;
//         }
    
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int b=scn.nextInt();
//     int n1=scn.nextInt();
//     //input of 2 will be greater than n1 here
//     int n2=scn.nextInt();
//     int d= anybasesub(b,n1,n2);
//     System.out.println(d);

// }
// } 

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Any base multiplication


import java.util.Scanner;
import java.lang.Math;

public class functions {
    
    public static int getproduct(int b, int n1, int n2) {
        int result=0;

        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;
            int sprd = getProductWithASingleDigit(b, n1, d2);
            result = anybaseadd(b,result,sprd*p);
            p=p*10;
        }
        return result;
    }

    public static int getProductWithASingleDigit(int b,int n1,int d2) {  //n2 ke 1 digit
        int result = 0;

        int c=0;
        int p=1;
        while(n1>0 || c>0){
            int d1 = n1%10;  //n1 ka 1 digit
            n1=n1/10;

            int d =d1*d2+c;  
            c=d/b; //quotient...jo carry hoga next pr
            d=d%b;   //reminder jo ayega ans me
            
            result = result + d*p;
            p=p*10;
            
        }

        return result;
    }

    public static int anybaseadd(int b, int n1, int n2){
    int result=0;
    int c=0;
    int p=1;
    while(n1>0||n2>0||c>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;  //agar example..8 base hai carry is remainder
            d=d%b;  //this is quotient 

            result+=d*p;
            p=p*10; 
        }

        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b=scn.nextInt();
        int n1=scn.nextInt();
        //input of 2 will be greater than n1 here
        int n2=scn.nextInt();
        int d= getproduct(b,n1,n2);
        System.out.println(d);

    }
} 