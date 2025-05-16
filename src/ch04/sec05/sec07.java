package ch04.sec05;

public class sec07 {
    public static void main(String[] ars) {
        while(true) {
            int num = (int)(Math.random()*6)+1;
            System.out.println(num);
            if(num == 6){
                break;
            }
        }
        System.out.println("--끝--");
    }
}
