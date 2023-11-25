package Contest4;

import java.util.Scanner;

public class Bai13 {

    public static int sumDigit(long n) {
        if (n < 10) {
            return (int) n;
        }
        return (int) (n % 10) + sumDigit(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(sumDigit(n));
    }
}
