
package test;


public abstract class Rectangle {
 private double radius;
 private double width;
 private double length;

    public Rectangle() {
    }

    public Rectangle(double radius, double width, double length) {
        this.radius = radius;
        this.width = width;
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "radius=" + radius + ", width=" + width + ", length=" + length + '}';
    }
 
 public abstract void getArea();


}
