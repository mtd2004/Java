package Contest4;

import java.util.Scanner;

public class Bai20 {

    public static int thaoTac(int n) {
        int ans1 = 1000000000, ans2 = ans1, ans3 = ans2;
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            ans1 = thaoTac(n / 2) + 1;
        }
        if (n % 3 == 0) {
            ans2 = thaoTac(n / 3) + 1;
        }
        ans3 = thaoTac(n - 1) + 1;
        return (int) Math.min((int) Math.min(ans1, ans2), ans3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(thaoTac(n));
    }
}
