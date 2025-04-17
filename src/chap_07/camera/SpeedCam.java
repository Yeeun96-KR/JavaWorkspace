package chap_07.camera;

// SpeedCam is a Camera. (Is-A)
public class SpeedCam extends Camera{ // 자식클래스

    public SpeedCam() {
        //this.name = "과속단속 카메라";
        super("과속단속 카메라");
    }

    public void takePicture() {
        // 부모 클래스 메소드를 불러온 후, 뒤에 추가적 기능 사용
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        // 속도 체크
            System.out.println("속도를 측정합니다.");
        }

    public void recognizeLicensePlate() {
            System.out.println("차량 번호를 인식합니다.");
        }

    @Override // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
        }
    }

