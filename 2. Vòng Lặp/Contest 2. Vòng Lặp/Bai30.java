package Contest2;

import java.util.Scanner;

public class Bai30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
    }
}
