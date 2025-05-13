package ch04.sec02;

public class Misson03 {
    public static void main (String[] args) {
            int result =  (int)(Math.random()*100.0)+1;
            if(result % 2 == 0 )
            System.out.println(result + "는(은) 짝수입니다.");
            else
            System.out.println(result + "는(은) 홀수입니다.");
    }
}
 // 1~100 사이의 랜덤값 나오게 해주시고

        //value = 5l 라면
        //출력: 5는 홀수 입니다.

        //랜덤값이 value =97; 라면
        // 출력: 97는 홀수입니다.
