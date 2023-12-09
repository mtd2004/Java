package Contest5;

import java.util.Scanner;

public class Bai22 {
    public static int[] dem = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (dem[a[i]] == 1) {
                System.out.println(a[i]);
                check = true;
                break;
            }
            dem[a[i]]++;
        }
        if (!check)
            System.out.println(-1);
    }
}
