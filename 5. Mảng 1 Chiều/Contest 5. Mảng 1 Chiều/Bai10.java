package Contest5;

import java.util.Scanner;

public class Bai10 {

    public static int[] dem1 = new int[10000001];
    public static int[] dem2 = new int[10000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt() ;
            dem1[a[i]]++ ;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt() ;
            dem2[b[i]]++ ;
        }
        for(int i = 0 ; i < 10000001 ; i++) {
            if(dem1[i] > 0 && dem2[i] > 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0 ; i < 10000001 ; i++) {
            if(dem1[i] > 0 || dem2[i] > 0)
                System.out.print(i + " ");
        }
    }
}
