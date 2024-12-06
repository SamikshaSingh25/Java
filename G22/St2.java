//merge and sort in interfaces
// Define an interface with two methods
interface ArrayOperations {
    int[] mergeArrays(int[] arr1, int[] arr2);  // Method to merge arrays
    int[] sort(int[] arr);  // Method to sort an array
}

// Class that implements the interface
class St2 implements ArrayOperations {

    // Merge two arrays
    public int[] mergeArrays(int[] arr1, int[] arr2){
        int finallength = arr1.length + arr2.length;
        int[] merged = new int[finallength];
        for(int i=0;i<arr1.length;i++){
            merged[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length+i] = arr2[i];
        }
        return merged;
    }

    //sort
    public int[] sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
        }
        return arr;
    }
    public static void main(String[] args) {
        St2 am = new St2();
        
        // Test arrays
        int[] array1 = {10,20,30,40};
        int[] array2 = {5,15,25,35};
        
        // Merge the arrays
        int[] mergedArray = am.mergeArrays(array1, array2);
        
        // Sort the merged array
        int[] sortedArray = am.sort(mergedArray);
        
        // Display the sorted array
        System.out.println("Sorted Merged Array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}

//-----------------------------------------------------------------------------------------------------------------
