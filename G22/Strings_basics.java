
// public class String {
//     public static void main(String[] args) {
//         // String str1 = "Helo";
//         String st1 = new String(original: "Hello");
//         String st2 = new String(original: "Hello");

        
//     }
// }


//------------------------------------------------------------------------------------------------------------
//string palindrome

// public class Strings_basics {

//     public static boolean isPalindrome(String input) {
//         int s=0;
//         int e=input.length()-1;
//         while (s<e){
//             if(input.charAt(s) != input.charAt(e)){
//                 return false;
//             }
//             s++;
//             e--;
//         }
//         return true;
//     }

// public static void main(String[] args) {
//     String word="radar";
//     boolean result = isPalindrome(word);
//     System.out.println(result);
// }
// }

//---------------------------------------------------------------------------------------------------------
//

import java.util.Scanner;

public class Strings_basics { 

    // public static String reverseString(String input) { 

    //     // // Your code here 
    //     // StringBuilder str = new StringBuilder(input);
    //     // str.reverse();
    //     // return str.toString();

    // } 

 

    public static void main(String[] args) { 

        // String message = "Hello World"; 
        // String reversedMessage = reverseString(message); 

        // System.out.println(reversedMessage); // Output: dlroW olleH 

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        // int temp = scn.nextInt();
        int[] arr = new int[n];
        int[] temp = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     temp[(i+k)%n] = arr[i];
        // }
        
                
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[i] = arr[i+k];
        }
        for(int i=n-k;i<n;i++){
            arr[i] = temp[i-n+k];
        }
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    } 

} 