package Contest4;

import java.util.Scanner;

public class Bai12 {

    public static void thapLucPhan(long n) {
        if (n < 16) {
            if (n < 10) {
                System.out.print(n);
            } else {
                System.out.print((char) (55 + n));
            }
        } else {
            thapLucPhan(n / 16);
            int r = (int) (n % 16);
            if (r < 10) {
                System.out.print(r);
            } else {
                System.out.print((char) (55 + r));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        thapLucPhan(n);
    }
}
