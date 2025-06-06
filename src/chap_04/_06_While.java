package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While
        int distance = 25; // 전체 거리
        int move = 0; // 현재 이동 거리
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작을 때
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착하였습니다.");

        // 무한 루프
        move = 0;
        while (move < distance) { // 현재 이동 거리가 전체 거리보다 작을 때
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
        }
        System.out.println("도착하였습니다.");
    }
}
