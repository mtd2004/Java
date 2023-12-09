package Contest5;

import java.util.Scanner;

public class Bai24 {
    public static int Search1(int a[], int n, int k) {
        int l = 0, r = n - 1;
        int index = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == k) {
                index = m;
                r = m - 1;
            } else if (a[m] < k)
                l = m + 1;
            else
                r = m - 1;
        }
        return index;
    }

    public static int Search2(int a[], int n, int k) {
        int l = 0, r = n - 1;
        int index = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == k) {
                index = m;
                l = m + 1;
            } else if (a[m] < k)
                l = m + 1;
            else
                r = m - 1;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++)
                a[j] = sc.nextInt();
            if (Search1(a, n, k) != -1 && Search2(a, n, k) != -1)
                System.out.println((Search1(a, n, k) + 1) + " " + (Search2(a, n, k) + 1));
            else
                System.out.println(-1);
        }

    }
}
