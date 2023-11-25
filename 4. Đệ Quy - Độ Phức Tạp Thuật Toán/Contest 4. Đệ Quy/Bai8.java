package Contest4;

import java.util.Scanner;

public class Bai8 {

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.println(gcd(a, b) + " " + lcm(a, b));
    }
}
