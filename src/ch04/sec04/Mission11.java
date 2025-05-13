package ch04.sec04;

public class Mission11 {
    public static void main(String[] args) {
        // 2~9단 구구단 출력 단수가 바뀔 때 개행처리
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println();
            for (int i = 1; i <= 9; i++)
                System.out.println(dan + "x" + i + "=" + dan * i);
        }
    }
}