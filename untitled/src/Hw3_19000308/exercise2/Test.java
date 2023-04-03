package Hw3_19000308.exercise2;

public class Test {

    public static void main(String[] args) {
        // Tao mang kieu Shape
        Shape[] shapes = new Shape[5];
        shapes[1] = new Circle(3);
        shapes[0] = new Rectangle(1, 7);
        shapes[2] = new Sphere(7);
        shapes[5] = new Rectangle(7, 9);
        shapes[4] = new Circle(4);
        // in ra man hinh ten, chu vi, dien tich, the tich cua tung loai hinh tuong ung
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
