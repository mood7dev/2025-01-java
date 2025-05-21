package wkqeka;

import java.util.Scanner;

public class wkqeka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력> ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
    }
}
}
