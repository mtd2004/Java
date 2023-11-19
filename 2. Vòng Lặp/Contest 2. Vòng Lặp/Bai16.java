package Contest2;

import java.util.Scanner;

public class Bai16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        if (n == 0) {
            System.out.println(1);
            System.exit(0);
        }
        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}
