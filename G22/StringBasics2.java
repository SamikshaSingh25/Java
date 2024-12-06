//swap first and last letter of each word in a string
//eg: Hello world ->  oellH dorlw

// import java.util.Scanner;

// public class StringBasics2 {
//     public static void main(String[] args) {
//         // Scanner scn = new Scanner(System.in);
//         // String str = scn.nextLine();
//         // String temp;
//         // length = str.length();
//         String input = "Java is a good lang";
//         String output = swapLet(input);
//         System.out.println(output);

//         // System.out.println(str);
//     }
//     public static String swapLet(String input) {
//         String[] words = input.split("[,\\s]"); //ekk se jyada ke like [] me rakhna hai "\\s"ye space ke liye hai jab multiple dene ho, can do this as well [[" "]|[","]]
//         StringBuilder result = new StringBuilder();
//         for(String word : words){
//             if(word.length() > 1){
//                 result.append(word.charAt(word.length()-1)).append(word.substring(1,word.length()-1)).append(word.charAt(0)).append(" ");
//             }
//             else{
//                 result.append(word).append(" ");
//             }
//         }
//         return result.toString().trim();
//     }
// }

//-----------------------------------------------------------------------------------------------------------------------------
//Capitilize first word of string
//eg: Java is a good lang -> Java Is A Good Lang

// import java.util.Scanner;

// public class StringBasics2 {
//     public static void main(String[] args) {
//         String input = "Java is a good lang";
//         String output = swapLet(input);
//         System.out.println(output);

//         // System.out.println(str);
//     }
//     public static String swapLet(String input) {
//         String[] words = input.split("[\\s]"); //ekk se jyada ke like [] me rakhna hai "\\s"ye space ke liye hai jab multiple dene ho, can do this as well [[" "]|[","]]
//         StringBuilder result = new StringBuilder();
//         for(String word : words){
//             result.append(word.toUpperCase().charAt(0))
//             .append(word.toLowerCase()
//             .substring(1,word.length())).append(" ");            
//         }
//         return result.toString().trim();
//     }
// }

//-------------------------------------------------------------------------------------------------------------------------
//return count of palindromic in a string 
// Madam arora is a teacher -> 2  //because madam and arora is palindromic
import java.util.Scanner;
import java.util.*;

public class StringBasics2 {
    public static void main(String[] args) {
        String input = "Mad123am arora is teacher";
        int output = swapLet(input);
        System.out.println(output);
    }
    public static int swapLet(String input) {
        // String[] words = input.split("[\\s]"); //ekk se jyada ke like [] me rakhna hai "\\s"ye space ke liye hai jab multiple dene ho, can do this as well [[" "]|[","]]
        // StringBuilder result = new StringBuilder();
        // int count=0;
        // for(String word : words){
        //     boolean pal = true;
        //     int j = word.length()-1;
        //     for(int i=0; i<=j/2;i++){
        //         if(word.toLowerCase().charAt(i)!=word.toLowerCase().charAt(j)){
        //             pal = false;
        //             break;
        //         }
        //         j--;
        //     }  
        //     if(pal){
        //         count++;
        //     }          
        // }
        // return count;
        int sum = 0;
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                sum+=Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }
        return sum;
    }
}
