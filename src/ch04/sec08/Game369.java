package ch04.sec08;

public class Game369 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d", i);
            int temp = i;
            do {
            if (temp % 10 % 3 == 0 && temp % 10 != 0) {
                System.out.print("짝");
            }
        }while( (temp /= 10) != 0 );

            System.out.println();
        }
    }
}

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("i=%d ", i);

            int ones = i % 10;     // 1의 자리
            int tens = i / 10;     // 10의 자리

            boolean printed = false;

            if (tens == 3 || tens == 6 || tens == 9) {
                System.out.print("짝");
                printed = true;
            }

            if (ones == 3 || ones == 6 || ones == 9) {
                System.out.print("짝");
                printed = true;
            }

            if (!printed) {
                System.out.print(""); // 아무것도 출력 안 함
            }

            System.out.println(); // 줄 바꿈
        }
    }
}
 */
