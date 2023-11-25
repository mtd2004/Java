package Contest4;

import java.util.Scanner;

public class Bai10 {

    public static double sum(int n) {
        if (n == 1) {
            return 1;
        }
        return (double) 1 / n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.3f", sum(n));
    }
}
