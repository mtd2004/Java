package Contest5;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (ans < a[i]) {
                System.out.print(a[i] + " ");
                ans = a[i];
            }
        }
    }
}
