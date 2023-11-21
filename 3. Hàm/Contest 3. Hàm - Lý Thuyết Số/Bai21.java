package Contest3;

import java.util.Scanner;

public class Bai21 {

    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            if (prime(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
