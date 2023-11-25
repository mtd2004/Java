package Contest4;

import java.util.Scanner;

public class Bai11 {

    public static void nhiPhan(long n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            nhiPhan(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        nhiPhan(n);
    }
}
