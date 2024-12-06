
import java.util.Stack;

public class Intro {
    public static void main(String[] args) {
        //creating a stack
        Stack<Integer> st = new Stack<>();
        //to add elements
        st.push(10); 
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);
        //peek to look at the top element, and size to know the size of the stack
        System.out.println(st+"->"+st.peek()+" "+st.size());
        //to pop/remove the top element
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+"->"+st.size());
    }
}
