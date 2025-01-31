package step5;

import java.util.Scanner;

public class Num1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int num = sc.nextInt() - 1;

        //문자열 word의 num번째 문자를 가져온다.
        System.out.println(word.charAt(num));
    }
}
