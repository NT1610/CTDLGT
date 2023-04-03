package bai3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ComplexNumbers complexNumbers1 = new ComplexNumbers();
        ComplexNumbers complexNumbers2 = new ComplexNumbers();

        System.out.println("Nhập số phức 1: ");
        complexNumbers1.input(sc);
        System.out.println("Số phức 1: " + complexNumbers1.toString());

        System.out.println("Nhập số phức 2: ");
        complexNumbers2.input(sc);
        System.out.println("Số phức 2: " + complexNumbers1.toString());

        ComplexNumbers addComplex = complexNumbers1.add(complexNumbers2);
        System.out.println("Tổng hai số phức :" + addComplex);

        ComplexNumbers multiplicaComplex = complexNumbers1.multiplica(complexNumbers2);
        System.out.println("Tích hai số phức: " + multiplicaComplex);
    }
}
