package Contest1;

import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(1L * a * b);
        if (b == 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.4f", 1.0 * a / b);
        }
    }
}
