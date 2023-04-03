import java.util.Scanner;

public class FactorialPrime {
    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    static boolean isFactorialPrime(long n) {

        if (!isPrime(n))
            return false;

        long fact = 1;
        int i = 1;
        while (fact <= n + 1) {
            fact = fact * i;
            if (n + 1 == fact || n - 1 == fact)
                return true;
            i++;
        }

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if (isFactorialPrime(arr[i])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
