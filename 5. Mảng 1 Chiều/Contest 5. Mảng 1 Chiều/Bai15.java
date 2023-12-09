package Contest5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int ans = Integer.MAX_VALUE, count = 0;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++)
            ans = Math.min(ans, Math.abs(a[i] - a[i + 1]));
        for (int i = 0; i < n - 1; i++)
            if (Math.abs(a[i] - a[i + 1]) == ans)
                count++;
        System.out.println(ans + " " + count);
    }
}
