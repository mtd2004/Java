package Contest2;

import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= 2 * n - 1; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}
