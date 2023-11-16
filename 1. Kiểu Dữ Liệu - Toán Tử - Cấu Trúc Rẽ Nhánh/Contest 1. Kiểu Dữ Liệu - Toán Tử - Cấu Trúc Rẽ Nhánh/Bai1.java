package Contest1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        long ketQua = 1L * n * n * n + 3L * n * n + n + 1 ;
        System.out.println(ketQua);
    }
}
