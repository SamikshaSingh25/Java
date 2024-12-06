import java.util.Scanner;
import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("enter size:");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print("enter k:");
        int k = scn.nextInt();
        int[] nge = new int[n];

        //code start
        Stack <Integer> st = new Stack<>();
        st.push(arr.length - 1); //pushing last element
        nge[arr.length - 1] = arr.length; //yaha prr insteadof -1 we used arr.length as a marker coz baad me we see if the nge is in marker? like infinity bhi rakh sakte the... but arr.length is also good coz -1 se chota ho jayega
        for (int i = arr.length-2; i >=0; i--) {
            //pop, answer, push
            while(st.size()>0 && arr[i] >= arr[st.peek()]){ //storing indexes in stack
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = arr.length; //-1 rakhte the normal nge me(mtlb kisi ka next greater ni mila
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        for(int i=0;i<=arr.length-k;i++){
            //entering this loop to find the max of window starting at i
            int j = i;
            while(nge[j]<i+k){
                j=nge[j];
            }
            System.out.print(arr[j]+" ");
        }

    }
}
