package ch04.sec05;

import java.util.Scanner;

public class UpAdDownGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = (int) (Math.random() * 100.0) + 1;
        System.out.println("answer: " + answer);
        while (true) {
            System.out.print("1-100사이 숫자를 입력해주세요 > ");
            int number = sc.nextInt();
            if (number > answer) {
                System.out.println("Down!");
            } else if (number > answer) {
                System.out.println("UP!");
            } else {
                System.out.println("정답!");
                break;
            }
        }
    }
}
