package Contest5;

import java.util.Scanner;
import java.util.Arrays;

public class Bai11 {

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
        Arrays.sort(a);
        Arrays.sort(b);
        int[] hop = new int[n + m], giao = new int[Math.min(n, m)];
        int i = 0, j = 0;
        int h = 0, g = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                hop[h] = a[i];
                giao[g] = a[i];
                i++;
                j++;
                h++;
                g++;
            } else if (a[i] < b[j]) {
                hop[h] = a[i];
                i++;
                h++;
            } else {
                hop[h] = b[j];
                j++;
                h++;
            }
        }
        while (i < n) {
            hop[h] = a[i];
            i++;
            h++;
        }
        while (j < m) {
            hop[h] = b[j];
            j++;
            h++;
        }
        for (int x = 0; x < h; x++) {
            System.out.print(hop[x] + " ");
        }
        System.out.println();
        for (int x = 0; x < g; x++) {
            System.out.print(giao[x] + " ");
        }
    }
}
