package ch04.sec02;

public class Misson01 {
    public static void main(String[] args) {
        //응용력 테스트
        // 5~10 사이 랜덤값 나올 수 있도록 해주세요.

        for(int i=0; i<1000; i++) {
            int result = (int) (5 + (Math.random() * 6));

            if(result < 5 || result > 10) {
                System.out.println("틀렸음!");
                break;

            }
        }
    }
}

