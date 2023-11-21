package Contest3;

import java.util.Scanner;

public class Bai5 {

    public static void soChinhPhuong(long a, long b) {
        int left = (int) Math.sqrt(a);
        int right = (int) Math.sqrt(b);
        if (1L * left * left != a) {
            left++;
        }
        for (int i = left; i <= right; i++) {
            System.out.print(1L * i * i + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        soChinhPhuong(a, b);
    }
}
