package Contest5;

import java.util.Scanner;
import java.util.Arrays ;

public class Bai7 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a) ;
        for(int i = n - 1 ; i >= 0 ; i--) {
            if(a[i] % 2 == 1)
                System.out.print(a[i] + " ");
        }
        for(int i = 0 ; i < n ; i++) {
            if(a[i] % 2 == 0)
                System.out.print(a[i] + " ");
        }
    }
}
