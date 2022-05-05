package ss01_java.bai_tap;

import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        int vnd = 23000;
        int usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tiền USD : ");
        usd = scanner.nextInt();
        int quydoi = usd*vnd;
        System.out.print("Giá trị : "  + quydoi + "VND");
    }
}
