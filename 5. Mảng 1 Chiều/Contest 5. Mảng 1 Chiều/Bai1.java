package Contest5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {

    public static int MOD = 10000007;

    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean mangDoiXung(int a[], int n) {
        int l = 0, r = n - 1;
        while (l < r) {
            if (a[l] != a[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static long tichPhanTu(int a[], int n) {
        long res = 1;
        for (int i = 0; i < n; i++) {
            res = ((res % MOD) * (a[i] % MOD)) % MOD;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE, maxIndex = 0;
        int minValue = Integer.MAX_VALUE, minIndex = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (maxValue < a[i]) {
                maxValue = a[i];
                maxIndex = i;
            }
            if (minValue >= a[i]) {
                minValue = a[i];
                minIndex = i;
            }
            if (prime(a[i])) {
                count++;
            }
        }
        System.out.println(maxValue + " " + maxIndex);
        System.out.println(minValue + " " + minIndex);
        System.out.println(count);
        Arrays.sort(a);
        System.out.println((long) Math.max(1L * a[0] * a[1], 1l * a[n - 2] * a[n - 1]));
        if (mangDoiXung(a, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        System.out.println(tichPhanTu(a, n));
    }
}
