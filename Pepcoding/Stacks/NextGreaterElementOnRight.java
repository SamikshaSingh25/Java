//have to make this in O(n)
//APPROACH - 1

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementOnRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size:");
        int n = scn.nextInt();
        int[] arr= new int[n];
        int[] nge= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        st.push(arr[n-1]); //pushing last element
        nge[n-1]=-1;
        for (int i = n-2; i >= 0; i--) {
            //-a+
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i] = -1; //mtlb yahi sabse bada element hai 
            }
            else{
                nge[i] = st.peek(); //isse bada element
            }
            st.push(arr[i]); //khud ko push krlega
        }
        for (int j = 0; j < nge.length; j++) {
            System.out.print(nge[j]+" ");
        }

    }
}

//-----------------------------------------------------------------------------------------------------------------
//APPROACH - 2

// import java.util.Scanner;
// import java.util.Stack;

// public class NextGreaterElementOnRight {
//     public static void main(String[] args) {
//         Scanner scn = new Scanner(System.in);
//         System.out.print("enter the size:");
//         int n = scn.nextInt();
//         int[] arr= new int[n];
//         int[] nge= new int[n];
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<n;i++){
//             arr[i] = scn.nextInt();
//         }
//         st.push(0);
//         for (int i = 1; i < arr.length; i++) {
//             while(st.size() > 0 && arr[i] > arr[st.peek()]){ //arr[st.peek()] isliye likha coz stack me positions hai 
//                 int pos  = st.peek();
//                 nge[pos] = arr[i];  //uss position pr rakhe element ko current arr[i] pop krva ra hai 
//                 st.pop();
//             }
//             st.push(i);
//         }
//         while(st.size() > 0){
//             int pos = st.peek();
//             nge[pos] = -1;
//             st.pop();
//         }

//         for (int j = 0; j < nge.length; j++) {
//             System.out.print(nge[j]+" ");
//         }
//     }
// }