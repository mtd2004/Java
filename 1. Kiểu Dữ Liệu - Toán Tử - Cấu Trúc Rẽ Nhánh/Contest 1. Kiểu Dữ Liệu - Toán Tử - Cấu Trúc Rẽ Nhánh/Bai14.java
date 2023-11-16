package Contest1;

import java.util.Scanner;

public class Bai14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble();
        double c = sc.nextDouble(), d = sc.nextDouble();
        double diemTrungBinh = (a + b + 2 * c + 3 * d) / 7;
        if (diemTrungBinh >= 8) {
            System.out.println("GIOI");
        } else if (diemTrungBinh >= 6.5 && diemTrungBinh < 8) {
            System.out.println("KHA");
        } else if (diemTrungBinh >= 5 && diemTrungBinh < 6.5) {
            System.out.println("TRUNG BINH");
        } else {
            System.out.println("YEU");
        }
    }
}
