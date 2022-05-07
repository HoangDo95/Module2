package ss01_java.bai_tap;

import java.util.Scanner;

public class USDtoVND {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tiền USD : ");
        usd = scanner.nextDouble();
        double quydoi = usd*vnd;
        System.out.print("Giá trị : "  + quydoi + "VND");
    }
}
