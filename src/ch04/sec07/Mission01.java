package ch04.sec07;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성
        int sum = 0;
        int[] numbers = new int[100]; // 최대 100개 숫자 저장
        int index = 0; // 배열 인덱스

        System.out.println("--------------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4. 종료");
        System.out.println("--------------------------------");
        while (true) {
            System.out.print(">>");
            int number = sc.nextInt();

            if (number == 4) { // 0이 입력되면 종료
                break;
            } else if ( number == 1) { // 예금
                int money = sc.nextInt();
                sum += money;
            } else if ( number == 2) { // 출금
                int money = sc.nextInt();
                sum = sum - money;
            } else if ( number == 3 ) { // 잔고
                System.out.println(sum);
            } else {
            System.out.println("다시 입력하세요");
            }
        }
        System.out.println("프로그램 종료");
    }
}

        /*
        (프린트 반복 실행)
        --------------------------------
        1.예금 | 2.출금 | 3.잔고 | 4. 종료
        --------------------------------
        선택 >

        (예시)
        선택 > 1 (엔터)
        예금액 > 1000 (엔터)

        [[프린트]]
        선택 > 2 (엔터)
        출금액 > 2000 (엔터)

        [[프린트]]
        선택 > 3 (엔터)
        잔고 > 8,000원

        [[프린트]]
        선택 > 4

         */