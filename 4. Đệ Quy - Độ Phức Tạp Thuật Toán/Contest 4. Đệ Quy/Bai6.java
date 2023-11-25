package Contest4;

import java.util.Scanner;

public class Bai6 {

    public static long fibo(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
