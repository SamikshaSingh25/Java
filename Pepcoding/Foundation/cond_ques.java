
// //find prime
// import java.util.Scanner;

// public class cond_ques {
//     public static void main(String[] args) {

//         //time limit exceed

//         // Scanner scn=new Scanner(System.in);
//         // int t=scn.nextInt();
//         // for (int i = 0; i < t; i++) {
//         //     int n=scn.nextInt();
//         //     int count=0;
//         //     for(int div=1;div<=n;div++){
//         //         if(n%div==0){
//         //            count++;
//         //         }
//         //     }
//         //     if(count==2){
//         //         System.out.println("prime");
//         //     }
//         //     else{
//         //         System.out.println("not prime");
//         //     }
//         // }   


//         //to fix time limit 
//         Scanner scn=new Scanner(System.in);
//         int t=scn.nextInt();
//         for (int i = 0; i < t; i++) {
//             int n=scn.nextInt();
//             int count=0;
//             for(int div=2;div<n;div++){
//                 if(n%div==0){
//                     count++;
//                     break;
//                 }
//             }
//             if(count==0){
//                 System.out.println("prime");
//             }
//             else{
//                 System.out.println("not prime");
//             }
//         }  


//     }
// }

//---------------------------------------------------------------------------------------------------------
//prime numbers in a range

// import java.util.Scanner;

// public class cond_ques {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         int low =scn.nextInt();
//         int high = scn.nextInt();
//         for(int n=low;n<=high;n++){
//             int count=0;
//             //try to divide n and increase count
//             for(int div=2;div*div<=n;div++){
//             if(n%div==0){
//                 count++;
//                 break;
//             }
//             }
//             if(count==0){
//                 System.out.println(n);
//             }
//         }
//     }
// }

//--------------------------------------------------------------------------------------------------------
//fibonnaci number 

// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int f=0;
//     int s=1;
//     int sum=0;
//     for(int i=0;i<n;i++){
//         System.out.println(f);
//         sum=f+s;
//         f=s;
//         s=sum;
//     }
// }
// }

//----------------------------------------------------------------------------------------------------------------
//count digits in a number

// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int count=0;
//     while(n>0){
//         n=n/10;
//         count++;
//     }
//     System.out.println(count);
// }
// }

//-------------------------------------------------------------------------------------------------
//digits of a number

// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int nod=0;
//     int temp=n;

//     while(temp>0){
//         temp=temp/10;
//         nod++;
//     }

//     int div=(int)Math.pow(10, nod-1);

//     while(div>0){
//         int q=n/div;
//         System.out.println(q);
//         n=n%div;
//         div=div/10;
//     }

// }
// }

//-------------------------------------------------------------------------------
//reverse a num

// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     while(n>0){
//         int temp=n%10;
//         n=n/10;
//         System.out.println(temp);
//     }

// }
// }

//---------------------------------------------------------------------------------
//Inverse a number

// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int inverse=0;
//     int originalPlace=1;
//     while(n>0){
//         int originalDigit=n%10;
//         int invertedDigit=originalPlace;
//         int invertedPlace=originalDigit; 

//         //make change in inverse using invertedPlace and invertedDigit

//         inverse=inverse + invertedDigit * (int)Math.pow(10,invertedPlace-1);

//         n = n/10;
//         originalPlace++;

//     }
//     System.out.println(inverse);

// }
// }

//---------------------------------------------------------------------------------
//Rotate a number


// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     int Rotateby=scn.nextInt();

//     int temp=n;
//     int nod=0;
//     while(temp>0){
//         temp=temp/10;
//         nod++;
//         }
        
//         k=k%nod //this for bigger numbers
//         if(k<0){
//         k=k+nod;   //for -ve rotations
//         }
//         int div=1;
//         int mul=1;
//         for(int i=1;i<=nod;i++){
//             if(i<=Rotateby){
//             div=div*10;
//         }
//         else{
//             mul=mul*10;
//         }
//         }
//         int quotient=n/div;
//         int remainder=n%div;
//         int rotatednum=remainder*mul+quotient;
//         System.out.println(rotatednum);
//         }
//         }
        

//---------------------------------------------------------------------------------
//GCD and LCM


// import java.util.Scanner;

// public class cond_ques {
// public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     int n1=scn.nextInt();
//     int n2 =scn.nextInt();
//     int on1=n1;
//     int on2=n2;
//     while(n1%n2!=0){
//         int rem = n1%n2;
//         n1=n2;
//         n2=rem;
//     }
//     int gcd=n2;
//     int lcm =(on1*on2)/gcd;  //bachpan me padha tha formula
//     System.out.println("gcd is:"+gcd);
//     System.out.println("lcm is:"+lcm);
// }
// }


//---------------------------------------------------------------------------------
//prime factorization of a number


// import java.util.Scanner;

// public class cond_ques {
    // public static void main(String[] args) {
        //     Scanner scn = new Scanner(System.in);
//     int n=scn.nextInt();
//     for(int i=2;i*i<n;i++){ //ye i*i=n yahi i=root n me kuch cases reh jate hai jaise 46...which will have factors: 2 and 23 ...coz root 46 is 6..and 23 uske baad ata ha ...toh ek aur condition that if n is not 1 then __ should happen
//         //i<=n se bhi ho jata but time complexity bahot jyada ho jate
//         while(n%i==0){  //jab tak n divide hota rehta hai
//             n=n/i;
//             System.out.println(i);
//         }
//     }
//     if(n!=1){
//         System.out.println(n);
//     }
// }
// }


//---------------------------------------------------------------------------------
//pythagorean triplet


// import java.util.Scanner;

// public class cond_ques {
    // public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//     int a=scn.nextInt();
//     int b=scn.nextInt();
//     int c=scn.nextInt();
//     int max=a;
//     if(b>=max){
//         max=b;
//     }
//     if(c>=max){
    //         max=c;
    //     }
//     if(max==a){
    //         boolean flag = ((b*b + c*c )== (a*a));
//         System.out.println(flag);
//     }
//     else if(max==b){
    //         boolean flag = ((a*a + c*c )== (b*b));
//         System.out.println(flag);
//     }
//     else{
    //         boolean flag = ((b*b + a*a )== (c*c));
    //         System.out.println(flag);
    //     }
    
// }
// }
  
    
//---------------------------------------------------------------------------------
//benjamin bulbs

 import java.util.Scanner;

 public class cond_ques {
 public static void main( String[] args) {
     Scanner scn = new Scanner(System.in);
     int n=scn.nextInt();
     for(int i=1;i*i<=n;i++){
        System.out.println(i * i);
     }
 }
 }

