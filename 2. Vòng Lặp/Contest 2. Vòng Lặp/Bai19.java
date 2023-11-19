package Contest2;

import java.util.Scanner;

public class Bai19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int chai = n / 28, vo = chai;
        while (vo >= 3) {
            chai += vo / 3;
            vo = vo / 3 + vo % 3;
        }
        System.out.println(chai);
    }
}
