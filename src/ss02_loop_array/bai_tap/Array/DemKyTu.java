package ss02_loop_array.bai_tap.Array;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        System.out.println("Nhập ký tự");
        String kt = scanner.nextLine();
        char[] arr1 = kt.toCharArray();
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr1[0] == arr[i]) {
                count++;
            }

        }
        System.out.println("Ký tự " + kt + " suất hiện " + count + " lần");
    }
}
