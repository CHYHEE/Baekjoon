package step5;

import java.util.Scanner;

public class Num5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        int sum = 0;

        for(int i=0;i<n;i++) {
            // '0'을 하면 문자를 정수로 변환할 수 있다.
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
