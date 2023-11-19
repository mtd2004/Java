package Contest2;

import java.util.Scanner;

public class Bai31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1;
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            sum += 1.0 / res;
        }
        System.out.printf("%.2f", sum);
    }
}
