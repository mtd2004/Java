package Contest4;

import java.util.Scanner;

public class Bai22 {

    public static void printArray1(int a[], int n) {
        if (n == 1) {
            System.out.print(a[0] + " ");
        } else {
            System.out.print(a[n - 1] + " ");
            printArray1(a, n - 1);
        }

    }

    public static void printArray2(int a[], int n) {
        if (n == 1) {
            System.out.print(a[0] + " ");
        } else {
            printArray2(a, n - 1);
            System.out.print(a[n - 1] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        printArray2(a, n);
        System.out.println();
        printArray1(a, n);
    }
}
