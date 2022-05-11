package ss04_Access_modififier.bai_tap.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    void Display(){
        System.out.println("Bán kính: "+this.radius);
        System.out.println("Màu: "+this.color);
        System.out.println("Diện tích: "+getArea());
    }
}
