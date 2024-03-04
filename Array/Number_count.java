package Array;

import java.util.Scanner;

public class Number_count {
    public static int count(int n, int a) {
        int c = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            if (d == a) {
                c += 1;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        System.out.print(count(n, a));
    }
}
