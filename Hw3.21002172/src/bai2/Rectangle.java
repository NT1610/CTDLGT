package bai2;

public class Rectangle extends Shape {
    private double width = 0;
    private double height = 0;

    public Rectangle(double width, double height) {
        // Hàm khởi tạo
        this.width = width;
        this.height = height;
    }

    @Override
    protected double getVolume() {
        return 0;
    }

    @Override
    protected double getArea() {
        return this.height * this.width;
    }

    @Override
    protected double getPerimeter() {
        return 2 * this.height * this.width;
    }
}
