package Contest1;

import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), n = sc.nextInt();
        if (t >= 1 && t <= 12 && n > 0) {
            switch (t) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                case 2:
                    if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    }
                    break;
            }
        } else {
            System.out.println("INVALID");
        }
    }
}
