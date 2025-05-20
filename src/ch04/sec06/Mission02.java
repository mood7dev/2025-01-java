package ch04.sec06;

import java.util.Arrays;

public class Mission02 {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        // -------------------------------------
        int num = arr[0];
        int num2 = arr[1];
        arr[1] = num;
        arr[0] = num2;

        // -------------------------------------
            System.out.println(Arrays.toString(arr));
        }
    }

// [20,10]