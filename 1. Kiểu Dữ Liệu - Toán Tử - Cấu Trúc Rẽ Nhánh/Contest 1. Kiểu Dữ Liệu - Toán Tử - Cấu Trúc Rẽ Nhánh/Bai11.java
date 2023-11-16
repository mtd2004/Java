package Contest1;

import java.util.Scanner;

public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c && c == a) {
                System.out.println("1");
            } else if (a == b || b == c || c == a) {
                System.out.println("2");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
