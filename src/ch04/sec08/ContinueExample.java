package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) { // 이 라인은 수정 불가
            if (k % 2 != 0) {
                continue;
            }
            System.out.print(k + " ");
        }
    }
}

// 출력결과 246810