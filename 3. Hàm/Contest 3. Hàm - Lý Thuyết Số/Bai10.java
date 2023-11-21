package Contest3;

import java.util.Scanner;

public class Bai10 {

    public static void phanTich(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int mu = 0;
            if (n % i == 0) {
                while (n % i == 0) {
                    mu++;
                    n /= i;
                }
                System.out.print(i + "^" + mu);
                if (n != 1) {
                    System.out.print(" * ");
                }
            }
        }
        if (n != 1) {
            System.out.print(n + "^" + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        phanTich(n);
    }
}
