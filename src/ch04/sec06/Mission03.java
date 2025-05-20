package ch04.sec06;

import java.util.Arrays;

public class Mission03 {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------");

        System.out.print("[");
        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if(i == arr.length-1) {
                System.out.print(temp);
            } else {
            System.out.print(temp + ", "); }
        }
        System.out.print("]");
    }
}


