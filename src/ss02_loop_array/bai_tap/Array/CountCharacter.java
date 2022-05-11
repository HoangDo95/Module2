package ss02_loop_array.bai_tap.Array;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();
        char[] arr = string.toCharArray();
        System.out.println("Nhập ký tự");
        String resut = scanner.nextLine();
        char[] arr1 = resut.toCharArray();
        int count = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr1[0] == arr[i]) {
                count++;
            }

        }
        System.out.println("Ký tự " + resut + " suất hiện " + count + " lần");
    }
}
