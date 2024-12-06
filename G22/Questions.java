import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        //decimal to binary
        int bits=0;
        int power=1;
        while(n>0){
            int dig = n % 2;  
            n=n/2;
            bits=bits + (dig*power);
            power=power*10;
        }
        System.out.println(bits);
        int j=bits;

        // int result=1;
        // for(int i=32;i>0;i--){
            
        // }
        // System.out.println(result);

        //binary to decimal
        int result= 0;
        int power1 = 0;
        while(bits>0){
            int digi = bits%10;
            result+=(digi*(Math.pow(2,power1)));
            bits/=10;
            power1++;
        }
        System.out.println(result);
    }
}
