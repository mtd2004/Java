package Contest3;

import java.util.Scanner;

public class Bai15 {

    public static boolean check(int n) {
        boolean res = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            int cnt = 0;
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                    cnt++;
                }
            }
            if (cnt == 1) {
                return false;
            }
            if (cnt >= 2) {
                res = true;
            }
        }
        if (n != 1) {
            return false;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (check(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
