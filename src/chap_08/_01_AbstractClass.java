package chap_08;

import chap_08.Camera.Camera;
import chap_08.Camera.FactoryCam;
import chap_08.Camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스) - 객체를 만들 수 없음
        // 추상 클래스를 상속받은 자식 클래스는 객체 형성 가능
        // 추상 메소드 (추상 클래스에서만 사용 가능한 껍데기만 있는 메소드)
        // 추상 메소드도 마찬가지

        // Camera camera = new Camera(); - 추상클래스여서 오류
        Camera factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
