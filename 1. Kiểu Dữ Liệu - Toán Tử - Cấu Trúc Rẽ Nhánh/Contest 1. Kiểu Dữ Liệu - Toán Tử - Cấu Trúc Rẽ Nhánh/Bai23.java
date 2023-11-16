package Contest1;

import java.util.Scanner;

public class Bai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int maxn = n, minn = n / 2;
        if (n % 2 != 0) {
            minn++;
        }
        int ans = (minn + m - 1) / m * m ;
        if (ans <= maxn) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}
