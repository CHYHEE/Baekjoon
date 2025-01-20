package step4;

import java.util.Scanner;

public class Num4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[0];
        int index = 0;

        for(int j = 0; j < num.length; j++) {
            if (num[j] > max) {
                max = num[j];
                index = j + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
