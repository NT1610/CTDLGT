package Hw3_19000308.exercise2;

public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    protected double getVolume() {
        return 0;
    }

    protected double getArea() {
        return width * height;
    }

    protected double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle: width = %.2f , height =  %.2f, Perimeter = %.2f, Area = %.2f, Volume = %.2f",
                this.width, this.height, this.getPerimeter(), this.getArea(), this.getVolume());
    }
}
