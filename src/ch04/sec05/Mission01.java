package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int sum = 0;
        int number;

        while (true) {
            System.out.print("합계를 구할 입력을 입력하세요 (종료: 0) >>");
            int strMum = sc.nextInt(); // 숫자로 입력 받음

            sum += strMum;

            if(strMum == 0) {
            break;
        }
        }
        System.out.println("합계: " + sum);
        sc.close();
    }
}


        /* 합계를 구할 숫자를 입력하세요.(종료: 0)
        >> 100
        >> 200
        >> 300
        >> 400
        ...
        >> 0
        합계: 1000
         */