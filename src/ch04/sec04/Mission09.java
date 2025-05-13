package ch04.sec04;

public class Mission09 {
    public static void main(String[] args) {
        // 2~9사이 랜덤값
        int dan = (int) (Math.random() * 8) + 2;
        for (int i = 1; i <= 9; i++)
            System.out.println(dan + "x" + i + "=" + dan*i);
        }
    }


