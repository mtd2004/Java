package Contest4;

import java.util.Scanner;

public class Bai15 {

    public static int firstDigit(long n) {
        if (n < 10) {
            return (int) n;
        }
        return firstDigit(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(firstDigit(n));
    }
}
