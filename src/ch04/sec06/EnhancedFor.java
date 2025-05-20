package ch04.sec06;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] intArr = {11, 12, 19, 33, 45};
        for(int num : intArr) {
            System.out.println(num);
        }
        System.out.println("------------");
        for(int i=0; i<intArr.length; i++) {
            int num = intArr[i];
                System.out.println(num);
        }
    }
}

/*
향상된 for문
배열 같은 시퀀스가 있는 컬렉션에서 사용가능하다.
for(하나의 값 담을 수 있는 변수 : 컬렉션) {
*/
