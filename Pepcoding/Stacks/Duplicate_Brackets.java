//Duplicate Brackets
//eg : ((a+b) + (c+d)) -> false
// (a+b)+((c+d)) -> true

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st= new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch==')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else{
                    while(st.peek()!='('){//jab tak na mil jaye tab tak dhoondhenge
                        st.pop();
                    } 
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

