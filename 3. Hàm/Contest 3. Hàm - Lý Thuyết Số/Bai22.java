package Contest3;

import java.util.Scanner;

public class Bai22 {

    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (prime(i)) {
                System.out.print(1L * i * i + " ");
            }
        }
    }
}
