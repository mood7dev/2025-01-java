package ch04.sec06;

public class MultiArrayStudy2 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70}
        };
        for (int i = 0; i < arr.length; i++)
            for (int k = 0; k < arr[i].length; k++) {
                System.out.println(arr[i][k]);
            }
    }
}