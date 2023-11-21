package Contest3;

import java.util.Scanner;

public class Bai1 {

    public static boolean ham1(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static int ham2(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int ham3(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r % 2 == 0) {
                sum += r;
            }
            n /= 10;
        }
        return sum;
    }

    public static int ham4(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            if (r == 2 || r == 3 || r == 5 || r == 7) {
                sum += r;
            }
            n /= 10;
        }
        return sum;
    }

    public static int ham5(int n) {
        int res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res;
    }

    public static int ham6(int n) {
        int count = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            count++;
        }
        return count;
    }

    public static int ham7(int n) {
        int ans = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = i;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n != 1) {
            ans = n;
        }
        return ans;
    }

    public static boolean ham8(int n) {
        while (n != 0) {
            int r = n % 10;
            if (r == 6) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static boolean ham9(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 8 == 0;
    }

    public static long giaiThua(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static long ham10(int n) {
        long sum = 0;
        while (n != 0) {
            sum += giaiThua(n % 10);
            n /= 10;
        }
        return sum;
    }

    public static boolean ham11(int n) {
        int r = n % 10;
        n /= 10;
        while (n != 0) {
            if (n % 10 != r) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static boolean ham12(int n) {
        int r = n % 10;
        n /= 10;
        while (n != 0) {
            if (r < n % 10) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static int demSoChuSo(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static long ham13(int n) {
        long sum = 0;
        int ans = demSoChuSo(n);
        while (n != 0) {
            int r = n % 10;
            sum += (long) Math.pow(r, ans);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (ham1(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.println(ham2(n));
        System.out.println(ham3(n));
        System.out.println(ham4(n));
        System.out.println(ham5(n));
        System.out.println(ham6(n));
        System.out.println(ham7(n));
        if (ham8(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        if (ham9(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.println(ham10(n));
        if (ham11(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        if (ham12(n)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.println(ham13(n));
    }
}
