package Contest3;

import java.util.Scanner;

public class Bai16 {

    public static boolean prime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean soHoanHao(long n) {
        for (int i = 0; i <= 50; i++) {
            if (prime(i)) {
                long p = (long) Math.pow(2, i) - 1;
                if (prime(p)) {
                    long ans = (long) Math.pow(2, i - 1) * ((long) Math.pow(2, i) - 1);
                    if (ans == n) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (soHoanHao(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
