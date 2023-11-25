package Contest4;

import java.util.Scanner;

public class Bai24 {

    public static boolean check(int a[], int n) {
        if (n == 1) {
            return true;
        }
        if (a[n - 1] > a[n - 2]) {
            return check(a, n - 1);
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
        if (check(a, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
