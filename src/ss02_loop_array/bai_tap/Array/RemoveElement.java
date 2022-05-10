package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
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
        System.out.println("Nhập số");
        int num = scanner.nextInt();
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[index] = 0;
                i--;
                index--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
