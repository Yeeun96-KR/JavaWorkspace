package chap_08.Camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    // 추상 메소드는 선언만하고 끝을 냄
    // 자식 클래스에서 메소드를 구현해야 함
    public abstract void showMainFeature();
}
