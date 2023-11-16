package Contest1;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = 1.0 * c * 9 / 5 + 32;
        System.out.printf("%.2f", f);
    }
}
