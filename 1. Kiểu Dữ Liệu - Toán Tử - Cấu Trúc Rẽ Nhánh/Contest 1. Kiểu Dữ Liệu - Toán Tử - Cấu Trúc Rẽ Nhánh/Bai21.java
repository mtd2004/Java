package Contest1;

import java.util.Scanner;

public class Bai21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        if (k % 2 == 0) {
            System.out.println(1L * k / 2 * (a - b));
        } else {
            System.out.println(1L * k / 2 * (a - b) + a);
        }
    }
}
