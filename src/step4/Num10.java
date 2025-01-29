package step4;

import java.util.Scanner;

public class Num10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subject = sc.nextInt();
        double[] arr = new double[subject];
        double max = arr[0];
        double avg, sum = 0;

        for (int i = 0; i < subject; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }
        avg = sum / subject;

        System.out.println(avg);

    }
}
