package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0) ;
        score = 10;
        switch (score / 10) {
            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case  6, 5, 4, 3, 2, 1:
            System.out.println("D학점");
                break;
            default:
                System.out.println("측정불가");
                break;
        }
    }
}


