package Contest1;

import java.util.Scanner;

public class Bai32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2 = sc.nextInt() , k3 = sc.nextInt() ;
        int k5 = sc.nextInt() , k6 = sc.nextInt() ;
        int min1 = (int)Math.min(Math.min(k2, k5), k6) ;
        int min2 = (int)Math.min(Math.abs(k2 - min1), k3) ;
        System.out.println(1L * min1 * 256 + 1L * min2 * 32);
    }
}
