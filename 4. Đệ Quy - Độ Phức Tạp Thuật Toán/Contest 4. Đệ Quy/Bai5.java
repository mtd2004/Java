package Contest4;

import java.util.Scanner;

public class Bai5 {

    public static long giaiThua(int n) {
        if (n == 0) {
            return 1;
        }
        return n * giaiThua(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(giaiThua(n));
    }
}
