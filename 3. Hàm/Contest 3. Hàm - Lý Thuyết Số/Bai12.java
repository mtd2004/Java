package Contest3;

import java.util.Scanner;

public class Bai12 {

    public static int sumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean soSmith(int n) {
        int sum = 0, res = n, ans = sumDigit(n);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    sum += sumDigit(i);
                    n /= i;
                }
            }
        }
        if (n != 0) {
            sum += sumDigit(n);
        }
        if (res == n) {
            return false;
        }
        return sum == ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (soSmith(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
