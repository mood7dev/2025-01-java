/*
클래스라는 그릇을 만들어야 한다.
그릇에는 코드가 작성된다. (메소드, 변수 등등)
클래스 이름은 파일 이름과 같아야 한다.

메소드는 함수라고 보면 된다.
메인 메소드는 굉장히 중요한 메소드이다. 프로그램 시작점

메소드를 만드는 것은 "메소드 정의" 라고 표현.
메소드를 사용하는 것은 "메소드 호출" 라고 표현.
메소드가 호출되면 메소드 내용이 한 줄씩 실행됨.
*/

// 컨트롤 알트 쉬프트 L : 자동 정렬 ' 컨트롤 알트 L 도 가능
// 컨트롤 쉬프트 f10 : 메인 실행
// class 이름은 Pascal Case 로 작성을 해야한다. MyNameIsHong
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) { // 반복문, for-loop
            System.out.println("i = " + i);
        }
    }
}