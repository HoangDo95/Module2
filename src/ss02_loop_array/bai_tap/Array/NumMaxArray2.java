package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class NumMaxArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hàng");
        int row = scanner.nextInt();
        System.out.println("cột");
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("nhập giá trị " + i + "," + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(Arrays.toString(arr[k]));
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
