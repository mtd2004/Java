package Contest3;

import java.util.Scanner;

public class Bai30 {

    public static int MOD = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static long product(int n) {
        long ans = 1;
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            ans = ((ans % MOD) * (x % MOD)) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(product(n));
    }
}
