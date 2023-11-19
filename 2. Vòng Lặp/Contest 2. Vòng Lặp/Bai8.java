package Contest2;

import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            System.out.print(1L * i * i + " ");
        }
    }
}
