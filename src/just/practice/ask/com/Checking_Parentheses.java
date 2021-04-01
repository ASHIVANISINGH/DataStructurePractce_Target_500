package just.practice.ask.com;

import java.util.ArrayDeque;
import java.util.Deque;

public class Checking_Parentheses {
    public String checkParentheses(String s){
       // Deque<Character> stack=new Deque<Character>() ;
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty()){
                return "No";
            }
            char check;
            switch (x){
                case ')':
                    check=stack.pop();
                    if(check=='{' || check=='[')
                        return "No";
                    break;
                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='[')
                        return "No";
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='(' || check=='{')
                        return "No";
                    break;

            }
        }
        if(stack.isEmpty())
            return "Yes";
        else
            return "No";
       // return "Yes";
    }
    public static void main(String []args){
        Checking_Parentheses check=new Checking_Parentheses();
        String s="{[]]";
        System.out.println(""+check.checkParentheses(s));
    }
}
