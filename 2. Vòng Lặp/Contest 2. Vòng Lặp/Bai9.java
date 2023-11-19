package Contest2;

import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                res *= i;
            }
        }
        System.out.println(res);
    }
}
