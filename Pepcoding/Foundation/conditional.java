import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        // int x=101;
        // if(x%2==0){
        //     System.out.println("even");
        // }
        // else{
        //     System.out.println("odd");
        // }
        // System.out.println("hello world");

        // int n1=20;
        // int n2=30;
        // if(n1==n2){
        //     System.out.println(n1+" is equal to "+n2);
        // }
        // // else{
        // //     if(n1>n2){
        // //         System.out.println(n1+" is greater than "+n2);
        // //     }
        // //     else{
        // //         System.out.println(n1+" is less than "+n2);
        // //     }
        // // }
        // else if(n1>n2){
        //     System.out.println(n1+" is greater than "+n2);
        // }
        // else{
        //     System.out.println(n1+" is less than "+n2);
        // }

        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        if(x>90){
            System.out.println("excellent");
        }
        else if( x>80 && x<=90 ){
            System.out.println("good");
        } 
        else if(x>70 && x<=80){
            System.out.println("fair");
        }
        else if(x>60 && x<=70){
            System.out.println("meets expectations");
        }
        else{
            System.out.println("below par");
        }
    }
}
