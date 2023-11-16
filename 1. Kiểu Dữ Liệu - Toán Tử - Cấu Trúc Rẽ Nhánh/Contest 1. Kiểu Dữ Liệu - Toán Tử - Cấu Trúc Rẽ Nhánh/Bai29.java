package Contest1;

import java.util.Scanner;

public class Bai29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt() ;
        int c = sc.nextInt() , d = sc.nextInt() ;
        if(1L * b * b == 1L * a * c && 1L * c * c == 1L * b * d)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
