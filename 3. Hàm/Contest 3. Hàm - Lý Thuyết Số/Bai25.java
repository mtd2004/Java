package Contest3;

import java.util.Scanner;

public class Bai25 {

    public static int MOD = 1000000007;

    public static int degree(long n, int p) {
        int count = 0;
        for (long i = p; i <= n; i *= p) {
            count += n / i;
            count %= MOD;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(degree(n, 5));
    }
}
