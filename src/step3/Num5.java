package step3;

import java.util.Scanner;

public class Num5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
