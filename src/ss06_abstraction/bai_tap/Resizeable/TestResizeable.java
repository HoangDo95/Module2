package ss06_abstraction.bai_tap.Resizeable;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(5, "yellow", true);
        shape[1] = new Rectangle(4, 8, "red", true);
        shape[2] = new Square(3, "blue", true);
        System.out.println("List shape before: ");
        for (Shape value : shape) {
            System.out.println(value);
        }
        System.out.println("List shape after: ");
        for (Shape value : shape) {
            ((Resizeable) value).resize(Math.random() * 100);
            System.out.println(value);
        }
    }
}
