package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {

            int score = 89;

            if (score >= 90) {
                System.out.println("점수가 90보다 큽니다.");
                System.out.println("등급은 A입니다");

            } else if (score >= 80) {
                System.out.println("점수가 80~89입니다.");
                System.out.println("등급은 B입니다");
            } else if ( score >= 70 ) {
                System.out.println("점수가 80 미만입니다.");
                System.out.println("등급은 C입니다");
            } else {
                System.out.println("점수가 70미만 입니다");
                System.out.println("등급은 D입니다");
            }
            System.out.println("--끝--");
        }
    }
