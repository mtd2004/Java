package Contest1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        long ketQua = 1L * a * (b + c) + 1L * b * (a + c);
        System.out.println(ketQua);
    }
}
