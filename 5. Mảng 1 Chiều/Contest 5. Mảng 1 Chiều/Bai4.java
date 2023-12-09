package Contest5;

import java.util.Scanner;

public class Bai4 {

    public static boolean check(int a[], int n) {
        int c25 = 0, c50 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 25) {
                c25++;
            } else if (a[i] == 50) {
                if (c25 > 0) {
                    c25--;
                    c50++;
                } else {
                    return false;
                }
            } else {
                if (c25 == 0 || c25 * 25 + c50 * 50 < 75) {
                    return false;
                } else {
                    if (c50 > 0) {
                        c25--;
                        c50--;
                    } else {
                        c25 -= 3;
                    }
                }
            }
        }
        return true;
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
