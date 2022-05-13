package ss05_Inheritance.bai_tap.MovablePoint;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float arr[] = {this.x, this.y};
        return arr;
    }

    @Override
    public String toString() {
        return "Point(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }
}
