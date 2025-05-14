package ch04.sec03;

import java.util.Scanner;

public class SwitchStrinf {
    public static void main(String[] args) {
String gender = "남";
            switch (gender) {
                case "w", "W", "여자", "여":
                    System.out.println("여자");
                    break;
                case "m", "M", "남자", "남":
                    System.out.println("남자");
                    break;
                default:
                    System.out.println("다시 입력해주세요");
                    break;
            }
        }
    }


