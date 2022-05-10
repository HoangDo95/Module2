package ss03_oop.bai_tap.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a");
        double a = scanner.nextDouble();
        System.out.println("Input b");
        double b = scanner.nextDouble();
        System.out.println("Input c");
        double c = scanner.nextDouble();
       QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("r1 =" + quadraticEquation.getRoot1());
            System.out.println("r2 =" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("r1=r2= " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
