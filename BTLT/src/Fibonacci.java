import java.util.Scanner;

public class Fibonacci {
    public static boolean checkFibonacci(int x) {
        int x1 = 0;
        int x2 = 1;
        int xn = x1 + x2;
        for (int i = 0; i < x; i++) {
            if (x == x1 || x == x2 || x == xn) {
                return true;
            }else {
                x1 = x2;
                x2 = xn;
                xn = x1 + x2;
            }
            if (xn > x) {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (checkFibonacci(arr[i])) {
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
