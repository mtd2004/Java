package Contest3;

import java.util.Scanner;

public class Bai17 {

    public static boolean soThuanNghich(int n) {
        int res = n, ans = 0;
        while (n != 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return res == ans;
    }

    public static boolean countDivisor(int n) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            count++;
        }
        return count >= 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        boolean check = false;
        for (int i = a; i <= b; i++) {
            if (soThuanNghich(i) && countDivisor(i)) {
                check = true;
                System.out.print(i + " ");
            }
        }
        if (!check) {
            System.out.println("-1");
        }
    }
}
