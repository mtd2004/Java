package Contest4;

import java.util.Scanner;

public class Bai7 {

    public static int toHop(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return toHop(n - 1, k - 1) + toHop(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(toHop(n, k));
    }
}
