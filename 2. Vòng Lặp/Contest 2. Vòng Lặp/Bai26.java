package Contest2;

import java.util.Scanner;

public class Bai26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = sc.nextInt();
        boolean check = false;
        for (int i = 0; i <= n / a; i++) {
            if ((n - a * i) % b == 0) {
                check = true;
                break;
            }
        }
        if (check == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
