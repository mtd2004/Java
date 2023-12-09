package Contest5;

import java.util.*;

public class Bai14 {

    public static boolean check(int n) {
        while (n != 0) {
            int r = n % 10;
            n /= 10;
            if (r < n % 10)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int[] a = new int[100001];
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            a[count] = x;
            count++;
        }
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < count; i++) {
            if (check(a[i]))
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(mp.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                if (a.getValue() != b.getValue())
                    return b.getValue().compareTo(a.getValue());
                else
                    return a.getKey().compareTo(b.getKey());
            }
        });

        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
