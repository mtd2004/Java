package Contest4;

import java.util.Scanner;

public class Bai16 {

    public static int maxDigit(long n) {
        if (n < 10) {
            return (int) n;
        }
        return (int) Math.max(n % 10, maxDigit(n / 10));
    }

    public static int minDigit(long n) {
        if (n < 10) {
            return (int) n;
        }
        return (int) Math.min(n % 10, minDigit(n / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(maxDigit(n) + " " + minDigit(n));
    }
}
