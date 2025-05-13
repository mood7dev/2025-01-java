package ch04.sec04;

public class Mission05 {
    public static void main(String[] args) {
        // int starCount = 0; // (1) 2~7사이 랜더값
        int starCount = (int)(Math.random() * 6.0) + 2;
        for (int i = 0; i < starCount; i++); {
    System.out.print("*");
        }
    }
}
