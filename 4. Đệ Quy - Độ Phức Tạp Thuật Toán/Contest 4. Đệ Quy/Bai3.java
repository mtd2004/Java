package Contest4;

import java.util.Scanner;

public class Bai3 {

    public static long sum(int n) {
        if (n == 0) {
            return 0;
        }
        return 1L * n * n * n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
