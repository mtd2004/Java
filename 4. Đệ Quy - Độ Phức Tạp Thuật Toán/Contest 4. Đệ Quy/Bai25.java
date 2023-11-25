package Contest4;

import java.util.Scanner;

public class Bai25 {

    public static boolean Search(int a[], int l, int r, int x) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                return true;
            } else if (a[m] < x) {
                return Search(a, l, m - 1, x);
            } else {
                return Search(a, m + 1, r, x);

            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        if (Search(a, 0, n - 1, x)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
