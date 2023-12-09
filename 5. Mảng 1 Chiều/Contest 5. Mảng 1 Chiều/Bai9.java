package Contest5;

import java.util.Scanner;

public class Bai9 {

    public static int[] dem = new int[10000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            dem[a[i]]++;
        }
        for (int i = 0; i < 10000001; i++) {
            if (dem[i] != 0) {
                System.out.println(i + " " + dem[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (dem[a[i]] != 0) {
                System.out.println(a[i] + " " + dem[a[i]]);
                dem[a[i]] = 0;
            }
        }
    }
}
