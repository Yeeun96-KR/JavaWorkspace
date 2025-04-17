package chap_07.camera;

// 클래스 상속 불가
public final class ActionCam extends Camera{
    // 어디에서도 바꿀 수 없음
    public final String lens; // = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    // 자식클래스에서 오버라이딩 불가
    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 멋진 비디오를 제작합니다.");
    }
}
