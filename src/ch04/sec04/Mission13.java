package ch04.sec04;

public class Mission13 {
    public static void main(String[] args) {
        // 3~8 랜덤값
        int star = (int) (Math.random() * 6) + 3;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}