package Contest4;

import java.util.Scanner;

public class Bai14 {

    public static int count(long n) {
        if (n < 10) {
            return 1;
        }
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(count(n));
    }
}
