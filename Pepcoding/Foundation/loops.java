import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // int i=1;
        // while (i<=9) {
        //     System.out.println(i);
        //     i++;
        // }

        // for (int i = 1; i <= 9; i++) {
        //     System.out.println(i);
        // }

        // System.out.println("done");

        // Scanner scn=new Scanner(System.in);
        // // int n=scn.nextInt();
        // // for(int i=0;i<=n;i++){
        // //     System.out.println(i);
        // // }

        // String name = scn.nextLine();
        // System.out.println("Hello "+name);


        /*when trying to input both string and int in the same program doing 
        this is neccessary coz of a small bug (specially neccessary when you 
        are going to take integer value before the string value)
        
        (might work without it when you are inputting string before integer)*/
        Scanner scn=new Scanner(System.in);
        int n= Integer.parseInt(scn.nextLine());
        String name= scn.nextLine();
        System.out.println("Dear "+name+". Here is the counting:");
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }

    }
}
