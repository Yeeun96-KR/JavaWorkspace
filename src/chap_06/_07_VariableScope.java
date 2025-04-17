package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // 메인 영역 내에서 만든 변수는 메인 영역 내에서만 사용 가능
//        System.out.println(number);
    }

    public static void methodB() {
        int result = 1; // 지역 변수
    }

    public static void main(String[] args) {
        int number = 3; // 지역 변수
        // 메소드 영역 내에서 만든 변수는 메소드 영역 내에서만 사용 가능
//        System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // for문 내에서 만든 변수는 for문 내에서만 사용 가능
//        System.out.println(i);

        {
            int j = 0;
            System.out.println(j);
        }
        // 중괄호 내에서 만든 변수는 중괄호 내에서만 사용 가능
//        System.out.println(j);
    }
}
