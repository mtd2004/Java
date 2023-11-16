package Contest1;

import java.util.Scanner;

public class Bai15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt(), b = sc.nextInt();
        if (2 * a <= b) {
            System.out.println(n * a);
        } else {
            if (n % 2 == 0) {
                System.out.println(n / 2 * b);
            } else {
                System.out.println(n / 2 * b + a);
            }
        }
    }
}
