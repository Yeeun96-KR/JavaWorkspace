package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 115;
        String y = (x >= 120)? "키가 " + x + "cm 이므로 탑승 가능합니다" : "키가 " + x + "cm 이므로 탑승 불가능합니다";
        System.out.println(y);

        x = 121;
        y = (x >= 120)? "키가 " + x + "cm 이므로 탑승 가능합니다" : "키가 " + x + "cm 이므로 탑승 불가능합니다";
        System.out.println(y);
    }
}
