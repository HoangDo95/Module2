package ss05_Inheritance.bai_tap.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;

    }

    public Cylinder() {

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", color=" + getColor() +
                ", V=" + getVolume() +
                '}';
    }
}
