package Contest1;

import java.util.Scanner;

public class Bai34 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt();
        int c4 = sc.nextInt(), c5 = sc.nextInt();
        int ans = (c1 + c2 + c3 + c4 + c5) / 5;
        if ((c1 + c2 + c3 + c4 + c5) % 5 == 0 && ans != 0) {
            System.out.println(ans);
        } else {
            System.out.println(-1);
        }
    }
}
