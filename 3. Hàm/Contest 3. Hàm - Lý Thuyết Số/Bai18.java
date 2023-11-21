package Contest3;

import java.util.Scanner;

public class Bai18 {

    public static boolean soThuanNghich(int n) {
        int res = n, ans = 0;
        while (n != 0) {
            ans = ans * 10 + n % 10;
            n /= 10;
        }
        return res == ans;
    }

    public static boolean soLocPhat(int n) {
        int sum = 0;
        boolean check = false;
        while (n != 0) {
            int r = n % 10;
            if (r == 6) {
                check = true;
            }
            sum += r;
            n /= 10;
        }
        return check && sum % 10 == 8;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (soThuanNghich(i) && soLocPhat(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
