package Contest1;

import java.util.Scanner;

public class Bai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            if (c == 'Z') {
                System.out.println('a');
            } else {
                System.out.println((char) (c + 33));
            }
        } else {
            if (c == 'z') {
                System.out.println('a');
            } else {
                System.out.println((char) (c + 1));
            }
        }
    }
}
