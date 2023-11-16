package Contest1;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double chuVi = 2 * 3.14 * r;
        double dienTich = 3.14 * r * r;
        System.out.printf("%.4f %.4f", chuVi, dienTich);
    }
}
