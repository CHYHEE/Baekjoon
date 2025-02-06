package step5;

import java.util.Scanner;

public class Num4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //sc.next() : 사용자가 입력한 문자열 중 첫 번째 단어(공백 전까지)를 가져옴.
        //charAt(0) : 가져온 문자열의 첫 번째 문자(인덱스 0)를 추출함.
        int n = sc.next().charAt(0);
        System.out.println(n);
    }
}
