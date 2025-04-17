package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
//        int result = number * number;
//        return result;
        // 메소드 내에서 다른 메소드를 호출할 수 있음
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드 필요 이유
        System.out.println(getPower(2,2));
        System.out.println(getPower(3,3));
        System.out.println(getPower(4,2));

        // 2의 제곱
        int result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 2;
        }
        System.out.println(result);

        // 3의 3승
        result = 1;
        for (int i = 0; i < 3; i++) {
            result *= 3;
        }
        System.out.println(result);

        // 4의 제곱
        result = 1;
        for (int i = 0; i < 2; i++) {
            result *= 4;
        }
        System.out.println(result);
    }
}
