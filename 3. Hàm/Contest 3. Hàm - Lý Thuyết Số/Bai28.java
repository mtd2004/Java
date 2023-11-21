package Contest3;

import java.util.Scanner;

public class Bai28 {

    public static long[] fibo = new long[100];

    public static void init() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static long ans(long n) {
        long res = 0;
        for (int i = 0; i <= 92; i++) {
            if (fibo[i] >= n) {
                res = fibo[i];
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        init();
        System.out.println(ans(n));
    }
}
