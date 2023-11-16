package Contest1;

import java.util.Scanner;

public class Bai35 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();
        System.out.println(24 * 60 - h * 60 - m);
    }
}
