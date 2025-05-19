package Ekswlt;

import java.util.Scanner;

public class Ekswlt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0; // 돈
        int loanAmount = 0; // 대출금

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.대출 | 0.종료");
            System.out.println("--------------------------------");

            int menu = sc.nextInt();

            if (menu == 1) {  // 예금
                System.out.print("예금액을 입력하세요");
                int deposit = sc.nextInt();
                if (deposit < 0) {
                    System.out.println("잘못된 입력입니다");
                } else {
                    money += deposit;
                    System.out.println(deposit + "원이 예금 되었습니다");
                }
            } else if (menu == 2) {  // 출금
                System.out.print("출금액을 입력하세요");
                int withdraw = sc.nextInt();
                if (withdraw < 0) {
                    System.out.println("잘못된 입력입니다");
                } else if (withdraw > money) {
                    System.out.println("잔고가 부족합니다");
                } else {
                    money -= withdraw;
                    System.out.println(withdraw + "원이 출금 되었습니다");
                }
            } else if (menu == 3) {  // 잔고
                System.out.println("현재 잔고는" + money + "원 입니다");
                if (loanAmount > 0) {
                    System.out.println("현재 잔고는" + loanAmount + "원 입니다");
                }
            } else if (menu == 4) {  // 대출
                System.out.println("1.대출받기 | 2.대출금 확인 | 3.대출 상환");
                int loanOption = sc.nextInt();

                if (loanOption == 1) { // 대출받기
                    System.out.print("대출받을 금액을 입력하세요: ");
                    int loan = sc.nextInt();
                    if (loan <= 0) {
                        System.out.println("잘못된 입력입니다");
                    } else {
                        loanAmount += loan;
                        money += loan;
                        System.out.println(loan + "원이 대출 되었습니다");
                    }

                } else if (loanOption == 2) { // 대출금확인
                    System.out.println("현재 대출금은" + loanAmount + "원 입니다");

                } else if (loanOption == 3) { //대출상환
                    if (loanAmount == 0) {
                        System.out.println("상환할 대출이 없습니다");
                    } else {
                        System.out.print("상환할 금액을 입력하세요: ");
                        int repay = sc.nextInt();
                        if (repay <= 0) {
                            System.out.println("잘못된 입력입니다");
                        } else if (repay > money) {
                            System.out.println("잔고가 부족하여 상환할 수 없습니다");
                        } else if (repay > loanAmount) {
                            System.out.println("대출금보다 많ㅇ느 금액을 상환 할 수 없습니다");
                        }
                    }
                    if (menu == 0) {  // 종료
                        System.out.println("프로그램을 종료합니다");
                        break;
                    } else {
                        System.out.println("다시 입력해주세요");
                    }
                }
            }
        }
    }
}