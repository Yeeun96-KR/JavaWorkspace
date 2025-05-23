package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + " 하나");
        System.out.println(coffeeRachel + " 하나");
        System.out.println(coffeeChandler + " 하나");
        System.out.println(coffeeMonica + " 하나");
        System.out.println("주세요");

        // 배열 선언 첫 번째 방법
        // String[] coffees = new String[4];

        // 배열 선언 두 번째 방법
        // String coffees[] = new String[4];

//        coffees[0] = "아메리카노";
//        coffees[1] = "카페모카";
//        coffees[2] = "라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 세 번째 방법
        // String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 배열 선언 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("-----------------");

        // 주문
        coffees[2] = "에스프레소";
        for (int i = 0; i <4 ; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {10.1, 11.2, 13.5};
        boolean[] b = {true, true, false};
    }
}
