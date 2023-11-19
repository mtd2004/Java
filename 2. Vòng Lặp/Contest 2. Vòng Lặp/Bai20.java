package Contest2;

import java.util.Scanner;

public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println(n / 2);
        for (int i = 1; i <= n / 2 - 1; i++) {
            System.out.print(2 + " ");
        }
        if (n % 2 == 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
