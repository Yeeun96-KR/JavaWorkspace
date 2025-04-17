package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Object-Oriented Programming)
        // 유지보수 용이
        // 높은 재사용성

        // 배열은 같은 자료형태만 담을 수 있음
        String[] items = {"CPU", "RAM", "하드디스크"};

        // 첫번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // 두번째 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // BlackBox 클래스로부터 bbox 객체 생성
        // bbox 객체는 BlackBox 클래스의 인스턴스
        BlackBox bbox = new BlackBox();
        BlackBox bbox2 = new BlackBox();
    }
}
