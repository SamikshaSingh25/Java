//The time complexity is O(n), and the space complexity is O(n).
//prefix and suffix sum 

// import java.util.Scanner;

// public class MoreQuestions {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter size of array:");
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         int[] prefix = new int[n]; //pehle wala
//         int[] suffix = new int[n]; //bad wala
//         int[] finala = new int[n]; 
//         int prod=1;
//         for(int i=0;i<n;i++){
//             arr[i] = scn.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             prod*=arr[i];
//         }
//         int currprod=1;
//         System.out.println(prod);
//         for(int i=0;i<n;i++){
//             currprod*=arr[i];
//             prefix[i]=(prod/currprod);
//         }

//         System.out.println(" prefix array:");
//         for(int i=0;i<n;i++){
//             System.out.print(prefix[i]+" ");
//         }
//         suffix[0]=1;
//         int currcurr=1;
//         for (int i = 1; i < n; i++) {
//             currcurr*=arr[i-1];
//             suffix[i]= currcurr;
//         }
//         System.out.println(" suffix array:");
//         for(int i=0;i<n;i++){
//             System.out.print(suffix[i]+" ");
//         }
//         for(int i=0;i<n;i++){
//             finala[i] = suffix[i]*prefix[i];
//         }
//         System.out.println("final array:");
//         for(int i=0;i<n;i++){
//             System.out.print(finala[i]+" ");
//         }
//     }
// }

//----------------------------------------------------------------------------------------------------------
//reverse the string

// import java.util.Scanner;
// import java.lang.*;

// public class MoreQuestions {
    
//     public static String reverseString(String input) {        
//         StringBuilder str = new StringBuilder(input);
//         str.reverse();
//         return str.toString();
//     }
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the string to be reversed:");
//         String input = scn.nextLine();
//         String reversedMessage = reverseString(input); 
//         System.out.println(reversedMessage);
//     }
    
// }

//-----------------------------------------------------------------------------------------------------------------------
//reverse seperate words

// import java.util.Scanner;
// import java.lang.*;

// public class MoreQuestions {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the string to be reversed word by word:");
//         String input = scn.nextLine();
//         String[] arrofstr = input.split(" ");
//         for (String string : arrofstr) {
//             StringBuilder str = new StringBuilder(string);
//             str.reverse();
//             System.out.print(str+" ");
//         }
//     } 
// }

//---------------------------------------------------------------------------------------------------------------------
//reverse only letter/words..eg: abc123def45gh  -> cba123feg45hg


import java.util.Scanner;
import java.lang.*;

public class MoreQuestions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the string:");
        String input = scn.nextLine();
        int length=input.length();
        char temp = new char[length];
        // int x;
        for (int i = 0; i < length; i++) {
            if(input[i]>='a'&&input[i]<='z'||input[i]>='A'&&input[i]<='Z')
            temp[i]=input[i];
        }
        
        // String[] arrofstr = input.split("");
        
    } 
}
