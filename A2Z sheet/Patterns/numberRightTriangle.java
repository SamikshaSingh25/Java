/*
Input Format: N = 3
Result: 
1
1 2 
1 2 3

*/

import java.util.*;

public class numberRightTriangle {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("number of rows");
       int n = scn.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
}
