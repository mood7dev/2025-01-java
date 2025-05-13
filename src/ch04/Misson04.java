package ch04;

public class Misson04 {
    public static void main(String[] args) {
        // int score = ?? 0~200 사이의 랜덤값

        // 만약 score값이 100 ~ 90점 사이면 A학점
        // 만약 Score값이 80 ~ 90점 사이면 B학점
        // 만약 Score값이 70 ~ 79점 사이면 C학점
        // 만약 Score값이 70점 미만이면 D학점
        // 만약 Score값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력

        int score =  (int)(Math.random()*201.0);
        if ( score <= 100 && score >= 90 )
        System.out.println("A학점");
        if ( score <= 90 && score >= 80 )
        System.out.println("B학점");
        if ( score <= 80 && score >= 70 )
        System.out.println("C학점");
        if ( score < 70)
        System.out.println("D학점");
        if ( score >= 101 || score <= 0 )
        System.out.println("측정불가");

        System.out.println("--끝--");

    }
}

