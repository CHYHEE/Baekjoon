package step1;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        //일의 자리 숫자를 구하는 표현
        System.out.println(num1 * (num2 % 10));
        //십의 자리 숫자를 구하는 표현
        System.out.println(num1 * (num2 % 100 / 10));
        //백의 자리 숫자를 구하는 표현
        System.out.println(num1 * (num2 / 100));
        System.out.println(num1 *  num2);
    }
}
