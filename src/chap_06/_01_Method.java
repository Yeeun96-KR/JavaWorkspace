package chap_06;

public class _01_Method {

    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }

    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        sayHello();
        System.out.println("메소드 호출 후");
    }
}
