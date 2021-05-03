package stack.geekforgeek.com;

import java.util.Stack;

public class SimpleImplementationOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(13);
        stack.push(11);
        stack.pop();
        System.out.println(stack);

    }
}
