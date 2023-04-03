package bai2;

public class Sphere extends Shape {
    private double radius = 0;

    public Sphere(double radius) {
        // Hàm khởi tạo
        this.radius = radius;
    }

    @Override
    protected double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    protected double getArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    protected double getPerimeter() {
        return 0;
    }
}
