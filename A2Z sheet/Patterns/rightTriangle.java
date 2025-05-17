/*

Input Format: N = 3
Result: 
* 
* * 
* * * 

 */

import java.util.*;
public class rightTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter no. of rows");
        int n = scn.nextInt();
        for(int i=0;i<n;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
