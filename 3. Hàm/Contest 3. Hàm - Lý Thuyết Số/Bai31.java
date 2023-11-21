package Contest3;

import java.util.Scanner;

public class Bai31 {

    public static long lastDigit(int p, int x) {
        long res = 1;
        while (x != 0) {
            if (x % 2 == 1) {
                res *= p;
                res %= 10;
            }
            p = ((p % 10) * (p % 10)) % 10;
            x /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(), x = sc.nextInt();
        System.out.println(lastDigit(p, x));
    }
}
