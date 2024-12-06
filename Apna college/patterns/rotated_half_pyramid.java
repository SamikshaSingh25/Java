public class rotated_half_pyramid {
    public static void main(String[] args) {
        int n=4;
        // my solution==>

        // for(int i=n; i>=1;i--){
        //     for(int j=1; j<=i-1; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j<=n;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // apna college==>
        for(int i=1; i<=n;i++){
          for(int j=1; j<=n-i;j++){
            System.out.print(" ");
        }  
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }

}
