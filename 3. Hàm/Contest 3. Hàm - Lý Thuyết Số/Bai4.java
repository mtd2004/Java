package Contest3;

import java.util.Scanner;

public class Bai4 {

    public static boolean soChinhPhuong(long n) {
        int r = (int) Math.sqrt(n);
        return 1L * r * r == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (soChinhPhuong(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
