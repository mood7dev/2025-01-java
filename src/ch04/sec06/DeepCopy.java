package ch04.sec06;

import java.util.Arrays;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30};

        // arr1을 이용해서 똑같은 배열을 만든다.
        // 1. 똑같은 크기의 공간 할당
        int[] arr2 = new int[arr1.length];

        // 2. arr1 배열의 값을 arr2배열에 데이터를 같은 인덱스에 복사
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            // arr2 = arr1; // 얕은 복사(주소값 복사)

            System.out.println("arr1: " + Arrays.toString(arr1));
            System.out.println("arr2: " + Arrays.toString(arr2));
        }
    }
}
