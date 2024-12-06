// import java.sql.Array;
// import java.util.Arrays;

// public class TwoD_Arrays_basics {
    // public static void main(String[] args) {
    //     // int [][] arr= {{1,2,3},{3,4,5},{5,6,7}};
    //     // System.out.println(Arrays.deepToString(arr));
    //     int [][] arr = getArr();
    //     printArr(arr);
    // }
    // public static int[][] getArr() {
    //     return new int[][]{{1,2,3},{5,6,7}};
    // }
    // public static void printArr(int[][] arr) {
    //     System.out.println(Arrays.deepToString(arr));
    // }
//-------------------------
//     public static void main(String[] args) {
//         int [][] arr = getArr();
//         printArr(arr);
//     }
//     public static int[][] getArr() {
//         // return new int[][]{{1,2,3},{5,6,7}};
//         return new int[][]{{1,2,3},{5,6},{5,7,8,9}};   //jagged array or ragged array
//     }
//     public static void printArr(int[][] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }

// }

//---------------------------------------------------------------------------------------------------
//print sum of each row in a 2D array

// public class TwoD_Arrays_basics {
//     public static void main(String[] args) {
//         int [][] arr= {{1,2,3},{3,4,5},{5,6,7}};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 sum=sum+arr[i][j];
//             }
//             System.out.println(sum);
//             sum=0;
//         }
//     }
// }

//-------------------------------------------------------------------------------------------------------
//print maximum of each row in 2D array

// public class TwoD_Arrays_basics {
//     public static void main(String[] args) {
//         int [][] arr= {{3,2,1},{3,4,5},{5,6,7}};
//         int max=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j]>max){
//                     max=arr[i][j];
//                 }
//             }
//             System.out.println(max);
//             max=0;
//         }
//     }
// }