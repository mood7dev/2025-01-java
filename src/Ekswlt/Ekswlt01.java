package Ekswlt;

public class Ekswlt01 {
        public static void main(String[] args) {
            // 바깥쪽 반복문은 곱하는 수 (1~9)
            for (int i = 1; i <= 9; i++) {
                // 안쪽 반복문은 단 (2~9)
                for (int dan = 2; dan <= 9; dan++) {
                    System.out.print(dan + " x " + i + " = " + (dan * i) + "\t");
                }
                System.out.println(); // 한 줄 끝나면 줄바꿈
            }
        }
    }