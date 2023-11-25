package Contest4;

import java.util.Scanner;

public class Bai9 {

    public static int MOD = 1000000007;

    public static long powMod(int a, int b) {
        if (b == 0) {
            return 1;
        }
        long res = powMod(a, b / 2);
        if (b % 2 == 0) {
            return ((res % MOD) * (res % MOD)) % MOD;
        }
        return ((((res % MOD) * (res % MOD)) % MOD) % MOD * (a % MOD)) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(powMod(a, b));
    }
}
