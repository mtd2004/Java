package Contest5;

import java.util.Scanner;

public class Bai12 {
    public static boolean prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] a = new int[10001];
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            a[index] = x;
            index++;
        }
        for (int i = 0; i < index; i++) {
            boolean check = true;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                if (prime(a[i])) {
                    int count = 1;
                    for (int j = i + 1; j < index; j++) {
                        if (a[i] == a[j])
                            count++;
                    }
                    System.out.println(a[i] + " " + count);
                }
            }
        }
    }
}
