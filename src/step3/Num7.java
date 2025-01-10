package step3;

import java.util.Scanner;

public class Num7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] sum = new int[n];

        for (int i = 0; i < sum.length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum[i] = a + b;
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println("Case #" +(i+1) + ": " + sum[i]);
        }
    }
}
