package stack.geekforgeek.com;

import java.util.Stack;

public class SimpleImplementationOfStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(13);
        stack.push(11);
       // stack.pop();
        while (!stack.isEmpty()){
            System.out.println(" "+stack.pop());
        }
        stack.push(55);
        stack.push(01);
        System.out.println(" "+stack.size());
        System.out.println(" "+stack.peek());
        System.out.println(stack);

    }
}
