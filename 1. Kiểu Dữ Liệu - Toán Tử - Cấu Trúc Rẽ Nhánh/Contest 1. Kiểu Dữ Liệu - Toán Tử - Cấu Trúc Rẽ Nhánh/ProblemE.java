package Contest1 ;

import java.util.Scanner;

public class ProblemE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("VO SO NGHIEM");
                } else {
                    System.out.println("VO NGHIEM");
                }
            } else {
                double x = (double)-c / b ;
                System.out.printf("%.2f", x);
            }
        } else {
            int delta = b * b - 4 * a * c ;
            if (delta < 0) {
                System.out.println("VO NGHIEM");
            } else if (delta == 0) {
                System.out.printf("%.2f", (double)-b / (2 * a));
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a) ;
                double x2 = (-b + Math.sqrt(delta)) / (2 * a) ;
                System.out.printf("%.2f %.2f" , x1 , x2);
            }
        }
    }
}
