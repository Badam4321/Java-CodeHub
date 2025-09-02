package collectionframework.list.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "{(())}";
        if (isBalanced(str)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
    private static boolean isBalanced(String expression) {
        Map<Character, Character> map = Map.of(')' , '(' , ']' , '[' , '}' , '{' );
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{' ){
                stack.push(ch);
            }else if(ch == ')' || ch == ']' || ch == '}'){
                if(stack.isEmpty() ){
                    return false;
                }
                else if(stack.peek() != map.get(ch)){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();

    }
}
