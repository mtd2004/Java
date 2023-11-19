package Contest2;

import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 2022) {
                check = true;
                System.out.println("YES");
                break;
            }
        }
        if (!check) {
            System.out.println("NO");
        }
    }
}
