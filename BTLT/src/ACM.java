import java.util.Scanner;

public class ACM {

    public static int[] creatArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int result(int[] arr, int max) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum > maxSum && sum <= max) {
                        maxSum = sum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int n, max;
        int[] arrResult = new int[test];
        for (int i = 0; i < test; i++) {

            n = sc.nextInt();
            int[] arr = creatArr(n, sc);
            max = sc.nextInt();
            arrResult[i] = result(arr, max);
        }
        for (int i = 0; i < test; i++) {
            System.out.println(arrResult[i]);
        }
    }
}
