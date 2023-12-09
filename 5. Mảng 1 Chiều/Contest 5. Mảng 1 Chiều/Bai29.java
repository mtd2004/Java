package Contest5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                sum1 = sum1 * 10 + a[i];
            else
                sum2 = sum2 * 10 + a[i];
        }
        System.out.println(sum1 + sum2);
    }
}
