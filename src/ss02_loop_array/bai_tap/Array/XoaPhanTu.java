package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] numArr1 = {1, 2, 3, 3, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = scanner.nextInt();
        int index = numArr1.length - 1;
        for (int i = 0; i < numArr1.length; i++) {
            if (num == numArr1[i]) {
                for (int j = i; j < numArr1.length - 1; j++) {
                    numArr1[j] = numArr1[j + 1];
                }
                numArr1[index] = 0;
                i--;
                index--;
            }
        }
        System.out.println(Arrays.toString(numArr1));

    }
}
