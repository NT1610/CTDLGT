package bai3;

import java.util.Scanner;

public class ComplexNumbers {
    private double a;
    private double b;

    public ComplexNumbers() {
        a = 0;
        b = 0;
    }

    public ComplexNumbers(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Nhập số phức
    public void input(Scanner sc) {
        System.out.println("Nhập vào phần thực: ");
        this.a = sc.nextDouble();
        System.out.println("Nhập vào phần ảo: ");
        this.b = sc.nextDouble();
    }

    // Cộng số phức
    public ComplexNumbers add(ComplexNumbers complex) {
        double real = a + complex.a;
        double imaginary = b + complex.b;
        return new ComplexNumbers(real, imaginary);
    }

    // Nhân số phức
    public ComplexNumbers multiplica(ComplexNumbers complex) {
        double real = a * complex.a - b * complex.b;
        double imaginary = a * complex.b + b * complex.a;
        return new ComplexNumbers(real, imaginary);
    }

    // In số phức
    @Override
    public String toString() {
        if (b < 0) {
            return a + " - " + Math.abs(b) + "*i";
        }
        return a + " + " + b + "*i";
    }
}
