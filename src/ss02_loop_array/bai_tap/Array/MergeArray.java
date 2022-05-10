package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Độ dài mảng 1");
        int length = scanner.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập mảng");
            arr[i] = scanner.nextInt();
        }       System.out.println(Arrays.toString(arr));
        System.out.println("Độ dài mảng 2");
        int length1 = scanner.nextInt();
        int arr1[] = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Nhập mảng");
            arr1[i] = scanner.nextInt();
        }System.out.println(Arrays.toString(arr1));
        int length2 = length1+ length;
        int[] arr2 = new int[length2];
        for (int i = 0; i < length; i++) {
            arr2[i]=arr[i];
        }
        for (int i = 0; i < length1; i++) {
            arr2[arr.length+i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
