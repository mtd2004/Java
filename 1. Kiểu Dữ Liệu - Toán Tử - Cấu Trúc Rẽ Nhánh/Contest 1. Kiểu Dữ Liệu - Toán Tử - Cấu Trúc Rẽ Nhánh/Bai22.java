package Contest1;

import java.util.Scanner;

public class Bai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long s = sc.nextLong();
        if (s % n == 0) {
            System.out.println(s / n);
        } else {
            System.out.println(s / n + 1);
        }
    }
}
