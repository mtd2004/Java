package Contest2;

import java.util.Scanner;

public class Bai25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1;
        long product = 1;
        for (int i = 1; i <= n - 1; i++) {
            product *= i;
            sum += 1.0 / product;
        }
        System.out.printf("%.4f", sum);
    }
}
