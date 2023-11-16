package Contest1;

import java.util.Scanner;

public class Bai26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long c = sc.nextLong(), d = sc.nextLong();
        System.out.print((long) Math.max(Math.max(a, b), Math.max(c, d)));
        System.out.print(" ");
        System.out.print((long) Math.min(Math.min(a, b), Math.min(c, d)));
    }
}
