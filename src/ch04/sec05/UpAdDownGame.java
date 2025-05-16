package ch04.sec05;

import java.util.Scanner;

public class UpAdDownGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100.0) + 1;
        System.out.println("1-100사이 숫자를 입력해주세요 > 50");
        while (true) {
            System.out.print(">>");
            int number = sc.nextInt();

            if (number < answer) {
                System.out.println("Down!");
            } else if {
                (number > answer)
                System.out.println("Down!");
                break;
            }
        }
    }
}

/*
1-100사이 숫자를 입력해주세요 > 50
Down!
1-100사이 숫자를 입력해주세요 > 25
Up!

맞출때까지 반복한다.

정답!!
 */