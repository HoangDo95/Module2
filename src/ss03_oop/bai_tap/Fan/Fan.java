package ss03_oop.bai_tap.Fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";


    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public Fan() {

    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if(isOn()) {
            return "Fan is on{" +
                    " speed=" + this.speed +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        }else {
            return "Fan is off{" +
                    " radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        }
    }

}
