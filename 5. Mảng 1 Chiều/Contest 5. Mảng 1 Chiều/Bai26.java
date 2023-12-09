package Contest5;

import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        long ans = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                ans += Math.abs(a[i] - a[i - 1]) + 1;
            }
        }
        System.out.println(ans);
    }
}
