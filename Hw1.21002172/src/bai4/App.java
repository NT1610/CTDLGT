package bai4;

public class App {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(4, 1, 1, 2);
        Sphere sphere2 = new Sphere(2, 0.5, 0.5, 1);
        Sphere sphere3 = new Sphere(3, 2, 2, -1);

        System.out.println("Diện tích hình cầu 1: " + sphere1.area());
        System.out.println("Thể tích hình cầu 1: " + sphere1.volume());
        if (sphere1.overlap(sphere2)) {
            System.out.println("Hình cầu 1 và 2 bao nhau");
        } else if (sphere1.intersect(sphere2)) {
            System.out.println("Hình cầu 1 và 2 giao nhau");

        } else {
            System.out.println("Hình cầu 1 và 2 không bao nhau và không giao nhau");

        }
        if (sphere1.overlap(sphere3)) {
            System.out.println("Hình cầu 1 và 3 bao nhau");
        } else if (sphere1.intersect(sphere3)) {
            System.out.println("Hình cầu 1 và 3 giao nhau");

        } else {
            System.out.println("Hình cầu 1 và 3 không bao nhau và không giao nhau");

        }
        if (sphere2.overlap(sphere3)) {
            System.out.println("Hình cầu 2 và 3 bao nhau");
        } else if (sphere2.intersect(sphere3)) {
            System.out.println("Hình cầu 2 và 3 giao nhau");

        } else {
            System.out.println("Hình cầu 2 và 3 không bao nhau và không giao nhau");

        }
    }
}
