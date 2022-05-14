package ss06_abstraction.bai_tap.Colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Rectangle(3, 5);
        shape[1] = new Square(2, "red", true);
        for (Shape value : shape) {
            System.out.println(value);
            if (value instanceof Square) {
                ((Square) value).howToColor();
            }
        }
    }
}



