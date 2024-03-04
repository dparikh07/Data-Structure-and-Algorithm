package Recurrsion;

import java.util.Scanner;

public class towerOfHanoi {
    public static void f(int n, char t1, char t2, char t3) {
        if (n == 0) {
            return;
        }
        f(n - 1, t1, t3, t2);
        System.out.println(n + " " + t1 + "" + t2);
        f(n - 1, t3, t2, t1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char t1 = 'A';
        char t2 = 'B';
        char t3 = 'C';
        f(n, t1, t2, t3);
    }
}
