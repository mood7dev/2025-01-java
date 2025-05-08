package ch02.sec01;

public class VariablelnitializationExample {
    public static void main(String[] args) {
        int value; // 변수 선언, 선언을 할 때 데이터 타입 지정! (int는 정수타입)
        // 변수 사용 방법 2가지 : 읽기, 쓰기(우측에 =)
        value = 10;
        int result = value + 10; // 빨간색 줄 : 컴파일 에러
        // 컴파일 에러 : 실행 할 수 없음 , 런파일 에러 : 실행을 하는 도중에 에러가 발생
        System.out.println(result);
    }
}