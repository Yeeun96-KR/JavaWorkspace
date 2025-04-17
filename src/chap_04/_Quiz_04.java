package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 변수설정
        int fee = 4000;
        double discount = 0.5;
        int max = 30000;
        int time = 10;
        double totalFee = 0;
        String car = "Light";

        // 주차 요금 정산
        totalFee = fee * time;
        if (totalFee > max) {
            totalFee = max;
        }
        if (car == "Light" || car == "Disabled"){
            totalFee = totalFee * discount;
        }
        System.out.println("주차 요금은 " + totalFee + "원 입니다.");

        System.out.println("----------------");

        // 정답
        int hour = 10;
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;

        int price = hour * 4000;

        if (price > 30000) {
            price = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            price /= 2;
        }

        System.out.println("주차 요금은 " + price + "원 입니다.");
    }
}
