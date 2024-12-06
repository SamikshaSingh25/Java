import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Infix_Evaluation {3/
    public static void main(String[] args) {
        BufferReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        //code here
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch = exp.charAt(i);

            if(ch=='('){
                operators.push(ch);
            }
            else if(Character.isDigit(ch)){
                operands.push(ch-'0');
            }
            else if(ch==')'){
                while(operators.peek()!='('){
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    char opv = operation(v1, v2, operator);  //operation value
                    operands.push(opv);

                }
                operators.pop(); //opening bracket ko bhi toh hatana hai
            }
            else if(ch == '+' || ch =="-" || ch == "*" || ch=="/"){
                //ch is wan
        
                while(operators.size()>0 && operators.peek()!='(' && precedence(ch)<= precedence(operators.peek())){
                    char operator = operators.pop();
                    int v2 = operands.pop();
                    int v1 = operands.pop();

                    char opv = operation(v1, v2, operator);  //operation value
                    operands.push(opv);
                }
                operators.push(); //apne operator ko push krna ni bhoolna
            }
        }

    }
    public static int precedence(char optr){
        if(optr == '+'){
            return 1;
        }
        else if(optr == '-'){
            return 1;
        }
        else if(optr == '*'){
            return 2;
        }
        else{
            return 2;
        }
    }
    public static int operation(int v1, int v2, char optr ){
        if(optr == '+'){
            return v1+v2;
        }
        else if(optr == '-'){
            return v1-v2;
        }
        else if(optr == '*'){
            return v1*v2;
        }
        else{
            return v1/v2;
        }
    }


}
