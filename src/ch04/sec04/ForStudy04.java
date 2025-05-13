package ch04.sec04;

public class ForStudy04 {
    public static void main (String[] args) {
        for(int k=0; k<5; k++) {        // 바깥쪽 루프: 5번 반복
        for(int i=0; i<5; i++) {        // 안쪽 루프: 5번 반복
            System.out.println("야!");   // "야!" 출력
            // 5 (바깥쪽 반복) × 5 (안쪽 반복) = 25번
            }
        }
    }
}
