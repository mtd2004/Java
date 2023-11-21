package Contest3;

import java.util.Scanner;

public class Bai24 {

    public static int degree(long n, int p) {
        int count = 0;
        for (long i = p; i <= n; i *= p) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int p = sc.nextInt();
        System.out.println(degree(n, p));
    }
}
