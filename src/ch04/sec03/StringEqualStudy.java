package ch04.sec03;

public class StringEqualStudy {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        System.out.printf("1. %s == %s: %b\n", str1, str2, str1 == str2);
        System.out.printf("2. %s == %s: %b\n", str1, str2, str1.equals (str2));
        System.out.printf("3. %s == %s: %b\n", str1, str2, str2.equals (str1));

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.printf("4. %s == %s: %b\n", str1, str2, str3 == str4);
        System.out.printf("5. %s == %s: %b\n", str1, str2, str1.equals (str4));
        System.out.printf("6. %s == %s: %b\n", str1, str2, str2.equals (str3));
    }
}
