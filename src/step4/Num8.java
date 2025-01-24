package step4;

import java.util.Scanner;

public class Num8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int temp = 0;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    temp++;
                }
            }
            if (temp == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
