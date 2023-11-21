package Contest3;

import java.util.Scanner;

public class Bai13 {

    public static int maxDivisor(int n) {
        int ans = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            ans = n;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int x = sc.nextInt();
            System.out.println(maxDivisor(x));
        }
    }
}
