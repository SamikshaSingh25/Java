import java.util.Scanner;
import java.util.Stack;

public class Balanced_brackets {
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine();

    Stack<Character> st = new Stack<>();
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == '(' || ch == '[' || ch == '{'){
            st.push(ch);
        }
        else if(ch==')'){
            //made a func since this was gettin g repeated again and again
            boolean val = handleClosing(st, '('); 
            if(val == false){
                System.out.println(val);
                return;
            }
        }
        else if(ch==']'){
            //made a func since this was gettin g repeated again and again
            boolean val = handleClosing(st, '['); 
            if(val == false){
                System.out.println(val);
                return;
            }
        }
        else if(ch=='{'){
            //made a func since this was gettin g repeated again and again
            boolean val = handleClosing(st, '{'); 
            if(val == false){
                System.out.println(val);
                return;
            } 
        }
    }
    if(st.size()==0){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    // System.out.println(true);
}

//since this code was being repeated again and again
public static boolean handleClosing(Stack<Character> st, char bracket) {
    if(st.size()==0){
        System.out.println(false); //coz agar size 0 ho gaya hai and then ye bracket aya hai then that must mean this is an extra without an opening
        return false;
    }
    else if(st.peek()!=bracket){
        System.out.println(false); //mtlb closing bracket ko apna opening bracket ni mila toh this is also unblanaced
        return false;
    }
    else{
        st.pop(); //the closing bracket found it's opeing bracket before the stack size could become ze 
        return true;
    }
}
}












































































import java.util.*;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];  // To store the maximum of each window
        Deque<Integer> deque = new LinkedList<>();  // Deque to store indices

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();  // Remove the element from the front
            }

            // keep Removing elements from the back that are smaller than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element's index at the back of the deque
            deque.offer(i);

            // The first element in deque is the largest for the window [i-k+1, i]
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = solution.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));  // Output: [3, 3, 5, 5, 6, 7]
    }
}
