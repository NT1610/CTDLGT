package Hw3_19000308.exercise1;

import java.util.Scanner;

public class Test {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Nhap day n so phuc
        System.out.print("So luong so phuc co trong mang là: ");
        Complex[] array = new Complex[Integer.parseInt(sc.nextLine())];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phan thuc so phuc thu " + (i + 1) + ": ");
            float re = Float.parseFloat(sc.nextLine());
            System.out.print("Phan ao cua so phuc thu " + (i + 1) + ": ");
            float im = Float.parseFloat(sc.nextLine());
            array[i] = new Complex(re, im);
        }
        // In ra so phuc vi tri v trong mang
        System.out.print("Vi tri so phuc trong mang, v = ");
        int v = sc.nextInt();
        System.out.println("So phuc o vi tri thu " + v + " trong day la: " + array[v - 1].toString());
        // Tong n so phuc
        Complex ComplexSum = array[0];
        for (int i = 1; i < array.length; i++) {
            ComplexSum = ComplexSum.add(array[i]);
        }
        System.out.println("Tong cua n so phuc la: " + ComplexSum.toString());
        //Tich n so phuc
        Complex ComplexMultiply = array[0];
        for (int i = 1; i < array.length; i++) {
            ComplexMultiply = ComplexMultiply.times(array[i]);
        }
        System.out.println("Tich cua n so phuc la: " + ComplexMultiply.toString());

    }
}