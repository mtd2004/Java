package Contest3;

import java.util.Scanner;

public class Bai8 {

    public static boolean soLocPhat(long n) {
        while (n != 0) {
            int r = (int) (n % 10);
            if (r != 0 && r != 6 && r != 8) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (soLocPhat(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
