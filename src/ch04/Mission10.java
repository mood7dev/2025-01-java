package ch04;

public class Mission10 {
    public static void main(String[] args) {
        // 3~6 랜덤
        int star = (int) (Math.random() * 4) + 3;
        for (int k = 1; k <= star; k++) {
            System.out.println();
            for (int i = 1; i <= star; i++) {
                System.out.printf("*");
            }
        }
    }
}


