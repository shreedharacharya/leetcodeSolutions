package Easy;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        System.out.println(valid("(])"));
    }

    private static boolean valid(String s) {

        char[] c= s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<c.length;i++){

            if(c[i]=='(') stack.push(')');
            else if(c[i]=='{') stack.push('}');
            else if(c[i]=='[')stack.push(']');
            else if(stack.isEmpty() || stack.pop()!= c[i]) return false;
        }

        return stack.isEmpty();
    }
}
