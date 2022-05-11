package ss04_Access_modififier.bai_tap.Circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        circle.Display();
        System.out.println("Nhập bán kính:" );
        double radius = scanner.nextDouble();
        System.out.println("Nhập màu:" );
        String color = scanner.next();
        circle.setRadius(radius);
        circle.setColor(color);
        circle.Display();
    }
}
