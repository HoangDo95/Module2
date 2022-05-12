package ss05_Inheritance.thuc_hanh;

import ss05_Inheritance.thuc_hanh.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
