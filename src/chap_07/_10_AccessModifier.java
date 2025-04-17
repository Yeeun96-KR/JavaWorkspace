package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation)
        // 정보은닉 (Information hiding)

        // 접근 제어자
        // private : 같은 클래스
        // public : 모두 접근 가능
        // default : 같은 클래스/패키지
        // protected : 같은 클래스/패키지 - 다른 패키지 - 상속 시 사용 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        System.out.println("----------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResolution());

//        A a = new A();
    }
}
