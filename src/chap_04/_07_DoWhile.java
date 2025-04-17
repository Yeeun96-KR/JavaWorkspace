package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25;
        int move = 0;
        int height = 2;

        while (move+height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #1 ---");

        // 키가 엄청 큰 사람
        move = 0;
        height = 25;
        while (move+height < distance){
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #2 ---");

        // Do While 반복문
        // while : 조건이 참일 때만 실행
        // do while : 조건이 거짓이어도 최소 한번은 실행
        move = 0;
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        } while (move + height < distance);
        System.out.println("도착했습니다.");
    }
}
