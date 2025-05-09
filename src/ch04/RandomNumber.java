package ch04;

public class RandomNumber {
    public static void main (String[] args) {
        // ARI, Math.random() dobule 타입 리턴, 절대 1이 안 나온다.
        System.out.println( Math.random() );


        double value = 0.99999;
        double result = value * 10;
        System.out.println("result: " + result);
        int intResult = (int)result; // 강제 형변환, 명시적 형변환
        System.out.println("intResult: " + intResult);

        double value2 = 0.0002;
        System.out.println("value2" + (int)(value2 * 10.0)); // 0
        System.out.println( (int)(Math.random() * 10.0)); // 0~9

    }
}