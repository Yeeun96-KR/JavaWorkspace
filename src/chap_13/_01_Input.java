package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = sc.next(); // string으로 변환
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요");
////        int height = Integer.parseInt(sc.next());
//        int height = sc.nextInt();
//        System.out.println("몸무게를 입력하세요");
////        double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
//        String lang = sc.next(); // 한 단어
        String lang = sc.nextLine(); // 한 줄
        System.out.println("언어 : " + lang);

        sc.nextLine(); // 한 단어를 넘어간 부분은 삭제

        System.out.println("비우고 나니 기분이 어땠나요?");
//        String feeling = sc.next(); // 한 단어
        String feeling = sc.nextLine(); // 한 줄
        System.out.println("기분 : " + feeling);
    }
}
