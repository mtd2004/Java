package Contest5;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        long sum = 0;
        int index = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        long ans = sum;
        for (int i = 1; i <= n - k; i++) {
            sum = sum - a[i - 1] + a[i + k - 1];
            if (ans < sum) {
                ans = sum;
                index = i;
            }
        }
        System.out.println(ans);
        for (int i = 0; i < k; i++) {
            System.out.print(a[i + index] + " ");
        }
    }
}
