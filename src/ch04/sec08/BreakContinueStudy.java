package ch04.sec08;

public class BreakContinueStudy {
    public static void main(String[] args) {
        // 10번 반복하는 for문 2개 작성.
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break;
            }
            System.out.println(k);
        }
        System.out.println("--------------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}