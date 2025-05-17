/*
Input Format: N = 3
Result: 
1
2 2 
3 3 3

 */
import java.util.*;

public class numberRightTriangle2 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println("number of rows");
       int n = scn.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
       }
    }
}

