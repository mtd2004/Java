package Contest5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai28 {
    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a);
        long res = 0;
        for (int i = 0; i < n; i++) {
            res += 1L * a[i] * i;
            res %= MOD;
        }
        System.out.println(res);
    }
}
