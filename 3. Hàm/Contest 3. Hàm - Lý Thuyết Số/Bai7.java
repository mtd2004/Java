package Contest3;

import java.util.Scanner;

public class Bai7 {

    public static int soChinhPhuong(long a, long b) {
        int left = (int) Math.sqrt(a);
        int right = (int) Math.sqrt(b);
        if (1L * left * left != a) {
            left++;
        }
        return right - left + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        System.out.println(soChinhPhuong(a, b));
    }
}
