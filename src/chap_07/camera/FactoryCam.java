package chap_07.camera;

// FactoryCam is a Camera. (Is-A)
public class FactoryCam extends Camera{ // 자식클래스

    public FactoryCam() {
//        this.name = "공장 카메라";
        // 부모클래스 생성자 접근
        super("공장 카메라");
    }

    public void recordVideo() {
        // 부모 클래스 메소드를 불러온 후, 뒤에 추가적 기능 사용
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println("화재를 감지합니다.");
    }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
