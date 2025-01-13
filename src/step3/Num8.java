package step3;

import java.util.Scanner;

public class Num8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] sum = new String[t];
        int a, b;

        for (int i = 0; i < sum.length; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            sum[i] = a + " + " + b + " = " + (a + b);
        }

        for (int i = 0; i < t; i++) {
            System.out.println("Case #" + (i+1) + ": " + sum[i]);
        }
    }
}
