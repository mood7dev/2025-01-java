package Ekswlt;

import java.util.Arrays;

public class Ekswlt01 {
        public static void main(String[] args) {
            // 정수형 배열 intArr를 선언하고 초기화합니다.
            int[] intArr = {11, 12, 19, 33, 45};

            // 향상된 for문 (Enhanced for loop)을 사용하여 배열의 모든 요소를 출력합니다.
            // 배열에 있는 값을 하나씩 num에 넣어서 출력합니다.
            for(int num : intArr) {
                System.out.println(num); // 배열의 각 요소 출력
            }

            System.out.println("------------"); // 구분선 출력

            // 일반적인 for문을 사용하여 같은 배열의 요소를 출력합니다.
            // i는 배열의 인덱스를 의미합니다.
            for(int i = 0; i < intArr.length; i++) {
                int num = intArr[i]; // 인덱스를 이용하여 배열의 값을 가져옵니다.
                System.out.println(num); // 배열의 각 요소 출력
            }
        }
    }