package Contest4;

import java.util.Scanner;

public class Bai21 {

    public static boolean check(int a[], int l, int r) {
        if (l > r) {
            return true;
        }
        if (a[l] != a[r]) {
            return false;
        }
        return check(a, l + 1, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        if (check(a, 0, n - 1)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
