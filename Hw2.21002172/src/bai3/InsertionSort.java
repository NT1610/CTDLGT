package bai3;

import java.util.Scanner;

public class InsertionSort {
    public static int[] inputArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử mảng: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void printArr(int[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("; " + arr[i]);
        }
        System.out.print("]");
        System.out.println();
        ;
    }

    public static void sort(int[] arr) {
        int key;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                printArr(arr);
                count2++;
                count1++;
            }
            arr[j + 1] = key;
            count1++;
        }
        System.out.println("Số lần đổi chỗ là: " + count1);
        System.out.println("Số lần so sánh là: " + count2);
    }

    public static void main(String[] args) {
        int n = 50;
        long startTime = System.nanoTime();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (100 * Math.random());

        }
        sort(arr);

        long endTime = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);

    }
}
