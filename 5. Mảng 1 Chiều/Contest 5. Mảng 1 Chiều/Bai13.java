package Contest5;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        long count = 0;
        long n = sc.nextLong();
        for (int i = 0; i < a.length; i++) {
            count += n / a[i];
            n %= a[i];
        }
        System.out.println(count);
    }
}
