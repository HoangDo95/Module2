package ss02_loop_array.bai_tap.Loop;

import java.util.Scanner;

public class Image {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Image");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Tam giác vuông dưới");
            System.out.println("3. Tam giác vuông trên");
            System.out.println("4. Tam giác cân");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài");
                    int length = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập chiều rộng");
                    int width = Integer.parseInt(input.nextLine());
                    for (int i = 0; i < width; i++) {
                        for (int j = 0; j < length; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    System.out.println("Nhập chiều cao");
                    int height = Integer.parseInt(input.nextLine());
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.println("Nhập chiều cao");
                    int height1 = Integer.parseInt(input.nextLine());
                    for (int i = height1; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    System.out.println("Nhập chiều cao");
                    int height2 = Integer.parseInt(input.nextLine());
                    for (int i = 0; i <= height2; i++) {
                        for (int j = i; j < height2; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i*2 -1; k++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");
                    }
                    break;
            }

        }

    }
}
