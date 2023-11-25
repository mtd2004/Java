package Contest4;

import java.util.Scanner;

public class Bai18 {

    public static int tongChan(long n) {
        if (n < 10) {
            if (n % 2 == 0) {
                return (int) n;
            } else {
                return 0;
            }
        } else {
            if (n % 10 % 2 == 0) {
                return (int) (n % 10) + tongChan(n / 10);
            } else {
                return tongChan(n / 10);
            }
        }
    }

    public static int tongLe(long n) {
        if (n < 10) {
            if (n % 2 == 1) {
                return (int) n;
            } else {
                return 0;
            }
        } else {
            if (n % 10 % 2 == 1) {
                return (int) (n % 10) + tongLe(n / 10);
            } else {
                return tongLe(n / 10);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(tongChan(n));
        System.out.println(tongLe(n));
    }
}
