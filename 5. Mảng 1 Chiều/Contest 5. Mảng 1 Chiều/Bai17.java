package Contest5;

import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        long[] f = new long[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                f[0] = a[0];
            else
                f[i] = f[i - 1] + a[i];
        }
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            l--;
            r--;
            if (l == 0)
                System.out.println(f[r]);
            else
                System.out.println(f[r] - f[l - 1]);
        }
    }
}
