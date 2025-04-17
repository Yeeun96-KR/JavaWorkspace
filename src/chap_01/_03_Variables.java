package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "예은";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        // char - 문자 하나만 저장 가능
        char grade = 'A';
        name = "찬희";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        // double : 소수점 아래 15~16자리까지 입력 가능
        // float : 소수점 아래 7자리까지 가능, 뒤에 F를 붙여야 함
        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        // int : long 대비 작은 숫자
        // long : int 대비 큰 숫자, 뒤에 L을 붙여야 함
        long l = 1000000000000000L;
        l = 1_000_000_000_000_000L;
        System.out.println(l);
    }
}
