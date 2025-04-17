package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러, 예외)

        // 컴파일 오류
        // int i = "문자열";

        // 런타임 오류
         int[] arr = new int[3];
        // arr[5] = 100;

        // StackOverflowError
//        S s = new S();
//        s.methodA();

        try {
//            System.out.println(3 / 0);
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
// StackOverflowError
class S {
    public void methodA() {
        this.methodA();
    }
}