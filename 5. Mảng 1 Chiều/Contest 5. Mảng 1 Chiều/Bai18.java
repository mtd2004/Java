package Contest5;

import java.util.Scanner;

public class Bai18 {
    public static int[] dem = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dem[a[i]]++;
        }
        long ans = 0;
        for (int i = 0; i < 1000001; i++) {
            if (dem[i] != 0)
                ans += 1L * dem[i] * (dem[i] - 1) / 2;
        }
        System.out.println(ans);
    }
}
