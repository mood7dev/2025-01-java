package ch04.sec04;

public class Mission12 {
    public static void main(String[] args) {
        /*
        2 x 1 = 2 \t  3 x 1 = 3 ... 9 x 1 = 9
        2 x 2 = 4 \t  3 x 2 = 6 ... 9 x 2 = 18
        ...
        2 x 9 = 18 \t 3 x 9 = 27 ... 9 x 9 = 81
         */
        for (int dan = 2; dan <= 9; dan++) {
            System.out.println();
            for (int i = 1; i <= 9; i++) {
                System.out.print(dan + "x" + i + "=" + dan * i + "\t");
            }
        }
    }
}

