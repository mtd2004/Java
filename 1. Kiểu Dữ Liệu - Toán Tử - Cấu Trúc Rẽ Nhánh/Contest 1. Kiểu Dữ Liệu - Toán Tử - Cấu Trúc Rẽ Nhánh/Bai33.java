package Contest1;

import java.util.Scanner;

public class Bai33 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int n = sc.nextInt();
        int ans = (a + b + c + n) / 3;
        if ((a + b + c + n) % 3 == 0 && ans >= a && ans >= b && ans >= c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
