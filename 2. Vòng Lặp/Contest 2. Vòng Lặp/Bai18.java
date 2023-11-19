package Contest2;

import java.util.Scanner;

public class Bai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        while (n != 0) {
            int r = (int) (n % 10);
            if (r == 2 || r == 3 || r == 5 || r == 7) {
                count++;
            }
            n /= 10 ;
        }
        System.out.println(count);
    }
}
