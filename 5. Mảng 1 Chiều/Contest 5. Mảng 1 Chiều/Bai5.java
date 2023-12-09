package Contest5;

import java.util.Scanner;

public class Bai5 {

    public static void guiThu(int a[], int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println((int) Math.abs(a[0] - a[1]) + " " + (int) Math.abs(a[0] - a[n - 1]));
            } else if (i == n - 1) {
                System.out.println((int) Math.abs(a[n - 1] - a[n - 2]) + " " + (int) Math.abs(a[n - 1] - a[0]));
            } else {
                System.out.print((int) Math.min(Math.abs(a[i] - a[i - 1]), Math.abs(a[i] - a[i + 1])));
                System.out.print(" ");
                System.out.print((int) Math.max(Math.abs(a[i] - a[0]), Math.abs(a[i] - a[n - 1])));
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        guiThu(a, n);
    }
}
