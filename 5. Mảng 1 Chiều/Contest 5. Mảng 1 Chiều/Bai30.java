package Contest5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        k = Math.min(k , n - k) ;
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < k; i++)
            sum1 += a[i];
        for (int i = k; i < n; i++)
            sum2 += a[i];
        System.out.println(sum2 - sum1);
    }
}
