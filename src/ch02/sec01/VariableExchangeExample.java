package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String [] arg) {
        int x = 3, y = 5;
        System.out.println("x:" + x + ", y: " + y );
        int a = x;
        x = y;
        y = a;
        System.out.println("x:" + x + ", y: " + y );
    }
}
