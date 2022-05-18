package ss11_stack_queue.bai_tap;

import java.util.Stack;

public class ReverseStack {
    ReverseStack reverseStack = new ReverseStack();

    public static void main(String[] args) {

        int number = 12345;

        System.out.println(reverse_number(number));

    }

    public static Stack<Integer> stack = new Stack<>();

    static void push_digits(int number) {

        while (number != 0) {
            stack.push(number % 10);
            number = number / 10;
        }
    }

    static int reverse_number(int number) {
        push_digits(number);
        int reverse = 0;
        int i = 1;

        while (!stack.isEmpty()) {
            reverse = reverse + (stack.peek() * i);
            stack.pop();
            i = i * 10;
        }

        return reverse;

    }
}
