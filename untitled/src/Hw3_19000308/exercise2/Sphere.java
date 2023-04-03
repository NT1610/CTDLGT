package Hw3_19000308.exercise2;

public class Sphere extends Shape {
    private double radius = 0;

    public Sphere(double radius) {
        this.radius = radius;
    }

    protected double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    protected double getArea() {
        return 4* Math.PI * radius * radius;
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
        return String.format("Sphere: Radius = %.2f , Perimeter = %.2f, Area =  %.2f, Volume = %.2f", this.radius, this.getPerimeter(), this.getArea(), this.getVolume());

    }
}
