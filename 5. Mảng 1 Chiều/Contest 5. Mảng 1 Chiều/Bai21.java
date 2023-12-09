package Contest5;

import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] a = new int[100001];
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            a[count] = x;
            count++;
        }
        int chan = 0, le = 0;
        for (int i = 0; i < count; i++) {
            if (a[i] % 2 == 0)
                chan++;
            else
                le++;
        }
        if (chan > le && count % 2 == 0)
            System.out.println("YES");
        else if (le > chan && count % 2 == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
