package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.print("선택: ");

            String strMum = sc.nextLine();
            switch (strMum) {
                case "1":
                    speed++;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case "2":
                    speed--;
                    System.out.println("현재 속도 = " + speed);
                    break;
                case "3":
                    run = false;
                    break;
            }
        }
        System.out.println("--끝--");
        sc.close();
    }
}
