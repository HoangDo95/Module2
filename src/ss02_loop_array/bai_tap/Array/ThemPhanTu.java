package ss02_loop_array.bai_tap.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] numArr1 = {1, 2, 3, 4, 5};
        Scanner so = new Scanner(System.in);
        System.out.println("Nhập số");
        int num = so.nextInt();

        Scanner index = new Scanner(System.in);
        System.out.println("Nhập vị trí thêm");
        int vtr = index.nextInt();
        for (int i = 0; i < numArr1.length; i++) {
            if (vtr == i) {
              num = numArr1[i];

            }
        }
        System.out.println(Arrays.toString(numArr1));

    }
}
