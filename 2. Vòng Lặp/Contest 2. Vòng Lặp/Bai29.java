package Contest2;

import java.util.Scanner;

public class Bai29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                sum += x;
            }
        }
        System.out.println(sum);
    }
}
