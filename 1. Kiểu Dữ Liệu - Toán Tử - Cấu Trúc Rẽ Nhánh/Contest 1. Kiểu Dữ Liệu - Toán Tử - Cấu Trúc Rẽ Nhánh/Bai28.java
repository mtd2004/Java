package Contest1;

import java.util.Scanner;

public class Bai28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), u1 = sc.nextInt(), d = sc.nextInt();
        long sum = (2L * u1 + 1L * (n - 1) * d) * n / 2;
        System.out.println(sum);
    }
}
