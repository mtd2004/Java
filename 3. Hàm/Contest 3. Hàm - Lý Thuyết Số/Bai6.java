package Contest3;

import java.util.Scanner;

public class Bai6 {

    public static boolean check1(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static boolean check2(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return check1(sum);
    }

    public static boolean check3(int n) {
        while (n != 0) {
            int r = n % 10;
            if (r != 2 && r != 3 && r != 5 && r != 7) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (check3(i) && check2(i) && check1(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
