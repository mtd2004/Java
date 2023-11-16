package Contest1;

import java.util.Scanner;

public class Bai20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
        int ans1 = n / a, ans2 = m / a;
        if (n % a != 0) {
            ans1++;
        }
        if (m % a != 0) {
            ans2++;
        }
        System.out.println(1L * ans1 * ans2);
    }
}
