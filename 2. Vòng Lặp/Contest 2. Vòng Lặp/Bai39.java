package Contest2;

import java.util.Scanner;

public class Bai39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    System.out.print((char) (63 + i + j));
                } else {
                    System.out.print((char) (95 + i + j));
                }
            }
            System.out.println();
        }
    }
}
