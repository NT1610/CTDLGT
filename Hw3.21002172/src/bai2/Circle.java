package bai2;

public class Circle extends Shape {
    private double radius = 0;

    public Circle(double radius) {
        // Hàm khởi tạo
        this.radius = radius;
    }

    @Override
    protected double getVolume() {
        return 0;
    }

    @Override
    protected double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    protected double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
