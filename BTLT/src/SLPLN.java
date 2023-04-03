import java.util.Scanner;

public class SLPLN {
    public static int[] input(int n, Scanner sc){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int check(int x){
        int check =(int) Math.cbrt(x);
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = input(n, sc);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(check(arr[i]));
        }
    }
}
