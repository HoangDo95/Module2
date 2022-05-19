package ss11_stack_queue.bai_tap.decimaltobinari;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số: ");
        int num = Integer.parseInt(scanner.nextLine());
        while (num != 0) {
            int num1 = num % 2;
            stack.push(num1);
            num = num / 2;
        }
        System.out.println(stack);
        int[] arr = new int[stack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
















