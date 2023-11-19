package Contest2;

import java.util.Scanner;

public class Bai24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long tmp = Math.min(a, b);
        long product = 1;
        for (long i = 1; i <= tmp; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
