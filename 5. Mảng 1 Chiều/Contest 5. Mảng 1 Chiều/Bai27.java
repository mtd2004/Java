package Contest5;

import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                long res = a[i - 1] - a[i] + 1;
                int count = (int) (res / d);
                if (res % d != 0)
                    count++;
                a[i] += 1L * count * d;
                ans += count;
            }
        }
        System.out.println(ans);
    }
}
