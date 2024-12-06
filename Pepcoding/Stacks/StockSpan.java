//eg input: [2 5 9 3 1 12 6 8 7]
//output: 1 2 3 1 1 6 1 2 1 

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter the size:");
        int n = scn.nextInt();
        int[] arr= new int[n];
        int[] span= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        st.push(0);
        span[0]=1;
        for (int i = 1; i < arr.length; i++) { //1 se isliye chalaya coz 0th index ke value 1
            while(st.size()>0 && arr[i] > arr[st.peek()]){  //peek prr index hoga isliye us index wale ko ja kr search krna hoga us array me
                st.pop();
            }
            if(st.size() == 0){ //sab pop ho gaya mtlb usse chota koi hai he ni
                span[i] = i+1;
            } 
            else{
                span[i] = i-st.peek();  //jo isse bada left pr hai uske index ko minus karenge
            }
            st.push(i);
        }

        for (int j = 0; j < span.length; j++) {
            System.out.print(span[j]+" ");
        }
    }
}
