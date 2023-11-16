package Contest1;

import java.util.Scanner;

public class Bai24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(), d2 = sc.nextInt(), d3 = sc.nextInt();
        int ans1 = d1 + d2 + d3;
        int ans2 = 2 * (d1 + d2);
        int ans3 = 2 * (d1 + d3);
        int ans4 = 2 * (d2 + d3);
        System.out.println((int) Math.min(Math.min(ans1, ans2), Math.min(ans3, ans4)));
    }
}
