package stack.geekforgeek.com;

import java.util.Stack;

public class BalancedParentheses {

    // approach is simple
    // if opening bracket we get then  we push it on stack
    // else if we get closing bracket then we which bracket we get
    // and check matching with top of stack if match is found return false

    public static boolean checkBalanceParentheses(String str){
        // creating stack
        Stack<Character> stack=new Stack<>();

        for(char c : str.toCharArray()){
            // checking opening bracket
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else {
                // check closing bracket
                if(c!=')' && c != '}' ){
                    if(!stack.isEmpty()&&stack.peek()=='['){
                        stack.pop();
                    }else {
                        return false;
                    }
                }

                if(c!=')' && c != ']' ){
                    if(!stack.isEmpty()&&stack.peek()=='{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }

                if(c!=']' && c != '}' ){
                    if(!stack.isEmpty()&&stack.peek()=='('){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        // if stack is empty then that means every parentheses match found , if
        // stack is not empty then that means parentheses not match
        return (stack.isEmpty() ) ? true : false;
    }

    public static void main(String[] args) {
       // String str="(({[]}))";
        String str= "[()]{}{[()()]()}";

        System.out.println(" "+checkBalanceParentheses(str));
    }
}
