package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // 1등 : 전액
        // 2,3등 : 반액
        // 그 외 : 대상 아님

        // If Else 문을 이용
        int ranking = 1; // 등수
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용
        ranking = 4;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");


        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정
        int grade = 1;
        int price = 7000;
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");
        // 1등급 제품의 가격 : 10000원
        // 2등급 제품의 가격 : 9000원

        // if 범위가 있을 때 사용
        // switch 명확한 숫자가 있을 때 사용
    }
}
