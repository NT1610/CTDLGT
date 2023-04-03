package Hw3_19000308.exercise2;

public class Circle extends Shape {

    private double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getVolume() {
        return 0;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }

    protected double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: Radius =  %.2f, Perimeter = %.2f, Area = %.2f, Volume = %.2f",
                 this.getRadius(), this.getPerimeter(), this.getArea(), this.getVolume());
    }
}
