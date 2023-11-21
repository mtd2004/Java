package Contest3;

import java.util.Scanner;

public class Bai11 {

    public static boolean soSphenic(long n) {
        int count1 = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count1++;
                int count2 = 0;
                while (n % i == 0) {
                    count2++;
                    n /= i;
                }
                if (count2 > 1) {
                    return false;
                }
            }
        }
        if (n != 1) {
            count1++;
        }
        return count1 == 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (soSphenic(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
