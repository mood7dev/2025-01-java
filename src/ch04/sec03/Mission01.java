package ch04.sec03;

public class Mission01 {
    public static void main(String[] args){
// 0~15

        int month = (int)(Math.random()*16);
        int num = 13;
        //switch이용하여
        // month 값이 12,1,2라면 "겨울"
        // month 값이 3,4,5라면 "봄"
        // month 값이 6,7,8라면 "여름"
        // month 값이 9,10,11라면 "가을"
        // 나머지는 "해당 계절이 없습니다"
switch (num) {
    case 12:
    case 1:
    case 2:
        System.out.println("겨울");
        break;
    case 3:
    case 4:
    case 5:
        System.out.println("봄");
        break;
    case 6:

    case 7:
    case 8:
        System.out.println("여름");
        break;
    case 9:

    case 10:
    case 11:
        System.out.println("가을");
        break;
    default:
        System.out.println("해당 계절이 없습니다.");
        break;
}
    System.out.println("--끝--");
}
    }

