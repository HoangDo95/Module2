package ss11_stack_queue.bai_tap.reverse;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
        Stack<String> stack1 = new Stack<>();
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");
        stack1.push("d");
        System.out.println(stack1);
        String[] arr1 = new String[stack1.size()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = stack1.pop();
        }
        System.out.print(Arrays.toString(arr1));
    }
}
