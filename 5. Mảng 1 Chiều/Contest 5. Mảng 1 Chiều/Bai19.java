package Contest5;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int count = 1, ans = 1, index = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1])
                count++;
            else
                count = 1;
            if (ans <= count) {
                ans = count;
                index = i - count + 1;
            }
        }
        System.out.println(ans);
        for (int i = 0; i < ans; i++)
            System.out.print(a[index + i] + " ");
    }
}
