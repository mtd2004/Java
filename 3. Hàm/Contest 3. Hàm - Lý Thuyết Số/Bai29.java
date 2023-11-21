package Contest3;

import java.util.Scanner;

public class Bai29 {

    public static int MOD = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static long sum(int n) {
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long x = sc.nextInt();
            ans = ((ans % MOD) + (x % MOD)) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
