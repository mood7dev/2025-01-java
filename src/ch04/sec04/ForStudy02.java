package ch04.sec04;

public class ForStudy02 {
    public static void main (String[] arg) {
        //Hello, World!! 콘솔에 5회 출력
        for(int i=0; i<5; i++)
        {
            System.out.println("Hello, World!!");
        }
            System.out.println("-----------(3)");
            // i<15는 수정 불가능. 나머지는 수정가능,
            // Hello, World!! 콘솔에 3회 출력
            for(int i=15; i>12; i--) {
                System.out.println("Hello, World!");
        }
    }
}
