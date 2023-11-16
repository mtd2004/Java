package Contest1;

import java.util.Scanner;

public class Bai31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt() , a2 = sc.nextInt() , a3 = sc.nextInt() ;
        int b1 = sc.nextInt() , b2 = sc.nextInt() , b3 = sc.nextInt() ;
        int n = sc.nextInt() ;
        int tongCup = a1 + a2 + a3 , tongHuyChuong = b1 + b2 + b3 ;
        int ke1 , ke2 ;
        if(tongCup % 5 == 0)
            ke1 = tongCup / 5 ;
        else
            ke1 = tongCup / 5 + 1 ;
        if(tongHuyChuong % 10 == 0)
            ke2 = tongHuyChuong / 10 ;
        else
            ke2 = tongHuyChuong / 10 + 1 ;
        if(ke1 + ke2 > n)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
