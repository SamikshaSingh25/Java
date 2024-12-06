/*
    2
  /   \
  3     8
 / \   / \
 5 9  10  7
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] arr={2,3,8,5,9,10,7};
        int n = arr.length;
        arr=hs(arr,n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static int[] hs(int[] arr, int n){
        for (int i = n/2-1; i>=0; i--) { //agar n/2 se karte toh ek iteration waste ho jate
            heapy(arr,n,i); //recursive operation hoga

        }
        for (int i = n-1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapy(arr, i, 0);
        }
        return arr;
    }

    public static void heapy(int[] arr , int n, int i) {
        int largest =i;
        int left = i*2+1;
        int right = i*2+2;
        if(left<n && arr[left]>arr[largest]){
            largest = left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            int temp = arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
        }
    }
}
