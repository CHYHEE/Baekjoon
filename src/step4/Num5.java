package step4;
import java.util.Scanner;

public class Num5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] temp = new int[N];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            for (int j = a - 1; j < b; j++) {
                temp[j] = c;
            }
        }

        for (int k = 0; k < temp.length; k++) {
            System.out.print(temp[k] + " ");
        }
    }
}

