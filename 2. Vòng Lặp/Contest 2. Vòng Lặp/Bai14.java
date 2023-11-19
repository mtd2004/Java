package Contest2;

import java.util.Scanner;

public class Bai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1L * i * i * i;
        }
        System.out.println(sum);
    }
}
