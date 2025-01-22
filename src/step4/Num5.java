package step4;
import java.util.Scanner;

public class Num5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            //배열의 인덱스는 0부터 시작하지만 입력값은 1부터 시작하는 값이기 때문에 I-1을 해준다.
            for (int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

