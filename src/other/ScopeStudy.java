package other;

public class ScopeStudy {
    /*
    * 스고프 : 변수가 살아있는 범위
    * 변수가 선언이 되면 자기 자신을 감싸고 있는 중괄호 안에서만 살아있음.
    * 중괄호 벗어나면 죽음.
    * */
    public static void main(String[] args) {
int num = 10;
System.out.println(num);

for(int i=0; i<10; i++) {
    System.out.println(i);
}
for(int i=0; i<10; i++) {
    System.out.println(i);
}
    }
}
