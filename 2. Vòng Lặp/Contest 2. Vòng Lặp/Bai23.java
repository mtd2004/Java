package Contest2;

import java.util.Scanner;

public class Bai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(cnt + " ");
                cnt++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int ans = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(ans + " ");
                ans++;
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i < n + 1 - j) {
                    System.out.print("~");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int res = i, pos = n - 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(res + " ");
                res += pos;
                pos--;
            }
            System.out.println();
        }
    }
}
