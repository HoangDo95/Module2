package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
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

        Scanner index = new Scanner(System.in);
        System.out.println("Nhập vị trí thêm");
        int vtr = index.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (vtr == i) {
                for (int j = arr.length - 1; j > vtr; j--) {
                    arr[j] = arr[j - 1];
                }
            }
        }
        arr[vtr] = num;
        System.out.println(Arrays.toString(arr));

    }
}
