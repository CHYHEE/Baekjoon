package step1;

import java.util.Scanner;

public class Add11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //조건: A, B, C (1 ≤ A, B, C ≤ 10에 12제곱)
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.println(a + b + c);
    }
}
