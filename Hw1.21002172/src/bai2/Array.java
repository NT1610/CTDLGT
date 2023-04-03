package bai2;

import java.util.Comparator;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số phần tử mảng: ");
        int length = sc.nextInt();
        MyArrayGeneric<Integer> arr = new MyArrayGeneric<>(length);

        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ " + i + " : ");
            arr.set(i, sc.nextInt());
        }

        System.out.println("NHập phần tử cần tìm: ");
        int x = sc.nextInt();
        if (arr.searchArr(x)) {
            System.out.println("Phần tử " + x + " nằm trong mảng");
        } else {
            System.out.println("Phần tử " + x + " không nằm trong mảng");

        }

        arr.sort(Comparator.naturalOrder());
        System.out.println("Mang sau khi tu sap xep: ");
        System.out.println(arr.toString());
    }
}
