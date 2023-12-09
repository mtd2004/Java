package Contest5;

import java.util.Scanner;

public class Bai8 {

    public static void merge(int a[], int b[], int n, int m) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else {
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while (i < n) {
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < m) {
            System.out.print(b[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        merge(a, b, n, m);
    }
}
