package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class NumMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài mảng");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập mảng");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
