package ch04.sec03;

import java.util.Scanner;

public class Mission03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("점수를 입력해 주세요 > ");
            int score = scanner.nextInt(); // -10, 0, 120
            System.out.println("score: " + score);

            if (score >= 98 && score <= 100) {
                System.out.println("A+");
                break;
            } else if (score >= 94 && score <= 97) {
                System.out.println("A0");
                break;
            } else if (score >= 90 && score <= 93) {
                System.out.println("A-");
                break;
            } else if (score >= 88 && score <= 89) {
                System.out.println("B+");
                break;
            } else if (score >= 84 && score <= 87) {
                System.out.println("B0");
                break;
            } else if (score >= 80 && score <= 83) {
                System.out.println("B-");
                break;
            } else if (score >= 78 && score <= 79) {
                System.out.println("C+");
                break;
            } else if (score >= 74 && score <= 77) {
                System.out.println("C0");
                break;
            } else if (score >= 70 && score <= 73) {
                System.out.println("C-");
                break;
            } else if (score > 100 || score < 0) {
                System.out.println("잘 못된 점수 입니다");
            } else {
                System.out.println("D");
            }
        }
    }
    }
