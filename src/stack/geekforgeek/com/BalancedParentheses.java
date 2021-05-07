package stack.geekforgeek.com;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean checkBalanceParentheses(String str){
        Stack<Character> stack=new Stack<>();

        for(char c : str.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else {
                if(c!=')' && c != '}' ){
                    if(stack.peek()=='['){
                        stack.pop();
                    }else {
                        return false;
                    }
                }

                if(c!=')' && c != ']' ){
                    if(stack.peek()=='{'){
                        stack.pop();
                    }else {
                        return false;
                    }
                }

                if(c!=']' && c != '}' ){
                    if(stack.peek()=='('){
                        stack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return (stack.isEmpty() ) ? true : false;
    }

    public static void main(String[] args) {
        String str="(({[]}))";
        System.out.println(" "+checkBalanceParentheses(str));
    }
}
