package Contest4;

import java.util.Scanner;

public class Bai17 {

    public static void print1(long n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            print1(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    public static void print2(long n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            System.out.print(n % 10 + " ");
            print1(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        print1(n);
        System.out.println();
        print2(n);
    }
}
