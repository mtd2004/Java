package Contest3;

import java.util.Scanner;

public class Bai14 {

    public static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
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
