package step3;

import java.util.Scanner;

public class Num12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //hasNext()는 Scanner 객체가 읽을 수 있는 다음 입력 토큰이 있는지 확인한다.
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }

    }
}
