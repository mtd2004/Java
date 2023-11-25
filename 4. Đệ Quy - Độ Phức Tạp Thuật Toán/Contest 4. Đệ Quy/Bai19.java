package Contest4;

import java.util.Scanner;

public class Bai19 {

    public static boolean check(long n) {
        if (n < 10) {
            if (n % 2 == 0) {
                return true;
            }
            return false;
        } else {
            if (n % 10 % 2 == 0) {
                return check(n / 10);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (check(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
