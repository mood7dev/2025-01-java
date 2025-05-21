package ch04.sec06;

import java.util.Scanner;


public class Mission08 {
    public static void main(String[] args) {
        int[] arr = {77, 34, 109, 21, 101, 48};

        // arr 배열에서 가장 큰 값 찾아서 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요> ");
        int num = sc.nextInt();
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

