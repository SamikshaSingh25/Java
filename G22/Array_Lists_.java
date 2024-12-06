// import java.util.ArrayList;

// public class Array_Lists_ {
//     public static void main(String[] args) {
//         ArrayList<Integer> 
//     }
// }
//create a list of unique elements taken from the user. Sort and print these elements.

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Array_Lists_ {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    System.out.print("enter the number of elements:");
    int n = scn.nextInt();
    // int[] arr= new int[n];
    for(int i=0;i<n;i++){
        int k= scn.nextInt();
        if(!arr.contains(k)){
            arr.add(k);
        }
    }
    Collections.sort(arr);
    System.out.print(arr+ " ");
    
}
}