package bai1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static ArrayList<Complex> creatArr(Scanner sc, Random random) {
        System.out.println("Nhập n:");
        int n = sc.nextInt();

        ArrayList<Complex> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(new Complex(random.nextInt(10), random.nextInt(10)));
        }
        return array;
    }

    public static void search(ArrayList<Complex> array, Scanner sc) {
        System.out.println("Nhập vị tri v:");

        System.out.println(array.get(sc.nextInt()));
        ;
    }

    public static Complex sumArr(ArrayList<Complex> arr) {
        Complex sum = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            sum = sum.add(arr.get(i));
        }
        return sum;
    }

    public static Complex multiply(ArrayList<Complex> arr) {
        Complex result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            result = result.time(arr.get(i));
        }
        return result;
    }

    public static void print(ArrayList<Complex> arr) {
        for (Complex i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        ArrayList<Complex> array = creatArr(sc, random);
        print(array);
        search(array, sc);
        System.out.println("Tổng " + array.size() + "số phức trong mảng là: " + sumArr(array).toString());
        System.out.println("Tích " + array.size() + "số phức trong mảng là: " + multiply(array).toString());
    }
}
