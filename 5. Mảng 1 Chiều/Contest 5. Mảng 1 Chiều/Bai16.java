package Contest5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            a[i] *= a[i];
        Arrays.sort(a);
        boolean check = false;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            long ans = a[l] + a[r];
            if (ans == a[i]) {
                System.out.println("YES");
                check = true;
                break;
            } else if (ans < a[i])
                l++;
            else
                r--;
        }
        if (!check)
            System.out.println("NO");
    }
}
