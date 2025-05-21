package ch04.sec06;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        // 1. 정답 숫자를 저장할 배열 생성 (3자리)
        int[] answerArr = new int[3];
        Scanner sc = new Scanner(System.in);

        // 2. 정답 숫자를 1~9 사이에서 중복 없이 랜덤으로 생성
        for (int i = 0; i < answerArr.length; i++) {
            int rVal = (int) (Math.random() * 9.0) + 1; // 1~9 범위 난수
            answerArr[i] = rVal; // 인덱스 넣기

            // 중복 검사
            for (int z = 0; z < i; z++) {
                if (answerArr[z] == rVal) {
                    i--; // 중복이면 현재 위치 다시 처리
                    break;
                }
            }
        }

        System.out.println("💡 (디버깅용 정답): " + Arrays.toString(answerArr)); // 개발용 출력 (실제 게임에선 지워도 됨)

        // 3. 게임 루프 시작
        while (true) {
            System.out.printf("숫자 %d개를 연속으로 입력하세요 (예: 123) > ", answerArr.length);
            String input = sc.nextLine().trim(); // 공백 제거 후 입력받기

            // 4. 입력값 길이 체크 (숫자 3개만 입력 가능)
            if (input.length() != answerArr.length) {
                System.out.println("⚠️ 입력 개수가 정확하지 않습니다. 다시 시도하세요.");
                continue;
            }

            // 5. 문자열을 정수 배열로 변환
            int[] inputArr = new int[answerArr.length];
            boolean isValid = true;

            for (int i = 0; i < inputArr.length; i++) {
                try {
                    // 각 문자(숫자)를 정수로 변환
                    inputArr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));

                    // 숫자가 1~9 범위 안에 있는지 확인
                    if (inputArr[i] < 1 || inputArr[i] > 9) {
                        System.out.println("⚠️ 1~9 사이의 숫자만 입력하세요.");
                        isValid = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ 숫자만 입력해주세요.");
                    isValid = false;
                    break;
                }
            }

            // 6. 중복된 숫자가 있는지 확인
            for (int i = 0; i < inputArr.length; i++) {
                for (int j = i + 1; j < inputArr.length; j++) {
                    if (inputArr[i] == inputArr[j]) {
                        System.out.println("⚠️ 중복된 숫자는 입력할 수 없습니다.");
                        isValid = false;
                        break;
                    }
                }
            }

            if (!isValid) continue; // 입력이 잘못되면 다시 입력 받기

            // 7. 스트라이크, 볼 판정
            int s = 0, b = 0;
            for (int i = 0; i < answerArr.length; i++) {          // 정답 배열에서 하나씩 꺼냄
                for (int k = 0; k < answerArr.length; k++) {      // 입력 배열에서 하나씩 꺼냄
                    if (answerArr[i] == inputArr[k]) {            // 숫자가 같을 때
                        if (i == k) {
                            s++; // 같은 위치 같은 숫자 → 스트라이크
                        } else {
                            b++; // 숫자만 같고 위치 다름 → 볼
                        }
                    }
                }
            }

            // 8. 힌트 기능 추가: 정답 배열에 포함된 숫자 중 맞춘 것들만 보여주기
            StringBuilder hint = new StringBuilder();
            for (int userNum : inputArr) {
                for (int answerNum : answerArr) {
                    if (userNum == answerNum) {
                        hint.append(userNum).append(" ");
                        break;
                    }
                }
            }

            // 9. 결과 출력
            if (s == answerArr.length) {
                System.out.println("🎉 정답입니다! 게임 종료!");
                break;
            }

            System.out.printf("🔍 결과 → S: %d, B: %d, O: %d\n", s, b, answerArr.length - s - b);
            System.out.println("💡 힌트: 정답에 포함된 숫자들 중 당신이 맞춘 숫자 → " + hint.toString().trim());
        }

        System.out.println("-- 끝 --");
        sc.close();
    }
}


