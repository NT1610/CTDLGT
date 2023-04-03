package bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static List<Shape> creatShape() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.get(0).setName("Circle");

        shapes.add(new Rectangle(3, 4));
        shapes.get(1).setName("Rectangle");

        shapes.add(new Sphere(2));
        shapes.get(2).setName("Sphere");

        return shapes;
    }

    public static void print(List<Shape> shapes) {
        for (Shape i : shapes) {
            if (i.getName().equals("Circle") || i.getName().equals("Rectangle")) {
                System.out.println(i.getName() + " Dien tich la: " + i.getArea() + " Chu vi la: " + i.getPerimeter());
            } else {
                System.out.println(i.getName() + " Dien tich la: " + i.getArea() + " The tich la: " + i.getVolume());
            }
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = creatShape();
        print(shapes);
    }
}
