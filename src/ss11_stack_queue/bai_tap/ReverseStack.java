package ss11_stack_queue.bai_tap;

import java.util.Stack;

public class ReverseStack {
    ReverseStack reverseStack = new ReverseStack();

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (Integer item : stack) {
            System.out.println(item);
        }

    }
}
