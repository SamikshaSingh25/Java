import java.util.Stack;

public class Main {
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && 
                ((stack.peek() == '0' && c == '1') || (stack.peek() == '1' && c == '0'))) {
                stack.pop(); 
            } else {
                stack.push(c); 
            }
        }
        
        return stack.size();
    }

    
}
