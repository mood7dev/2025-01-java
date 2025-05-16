package Ekswlt;

import java.util.Scanner;

public class Ekswlt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 객체 생성
        int sum = 0;
        int[] numbers = new int[100]; // 최대 100개 숫자 저장
        int index = 0; // 배열 인덱스

        System.out.print("입력하세요 >> (종료: 0)");

        while (true) {
            System.out.print(">>");
            int number = sc.nextInt(); // 숫자 입력

            if (number == 0) { // 0이 입력되면 종료
                break;
            }

            numbers[index] = number; // 숫자를 배열에 저장
            index++; // 배열 인덱스 증가
            sum += number; // 숫자 합산

            // 계산식 출력
            StringBuilder A = new StringBuilder();
            for (int i = 0; i < index; i++) {
                if (i > 0) {
                    A.append("+"); // 첫 번째 숫자 이후에는 '+' 추가
                }
                A.append(numbers[i]);
            }

            // 현재 계산식과 합계 출력
            System.out.println("현재계산식: " + A.toString() + "=" + sum);
        }

        // 최종 합계 출력
        System.out.println("최종합계: " + sum);
    }
}