package Contest3;

import java.util.Scanner;

public class Bai27 {

    public static long[] fibo = new long[100];

    public static void init() {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 92; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static boolean check(long n) {
        for (int i = 0; i <= 92; i++) {
            if (fibo[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        init();
        if (check(n) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
