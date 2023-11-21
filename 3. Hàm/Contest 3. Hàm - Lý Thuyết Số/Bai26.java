package Contest3;

import java.util.Scanner;

public class Bai26 {

    public static int MOD = 1000000007;

    public static long fibo(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        long fn1 = 0, fn2 = 1, fn = 0;
        for (int i = 3; i <= n; i++) {
            fn = ((fn1 % MOD) + (fn2 % MOD)) % MOD ;
            fn1 = fn2;
            fn2 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
