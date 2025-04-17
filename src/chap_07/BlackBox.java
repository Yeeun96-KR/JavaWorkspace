package chap_07;

public class BlackBox {
    // static이 없으면 인스턴스 변수
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;

    static int counter = 0; // 시리얼 번호를 생성해주는 역할
    // 처음엔 0이었다가 ++ 연산을 통해서 증가

    // static을 붙이면 class 변수 - 모든 variable에 똑같이 적용
    static boolean canAutoReport = false;

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 위에 있는 BlackBox를 수행, 기본생성자 실행

//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    // 메소드
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1) {
            return 9;
        }
        else if (type == 2) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

        void record() {
            record(true, true, 5);
        }

        // static을 붙이면 class 변수 - 모든 variable에 똑같이 적용
        // class method : instance 없이 클래스 이름으로 직접 호출 가능
        static void callServiceCenter() {
            System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
            // modelName = "test";
        }

    // 매개변수와 멤버변수 이름이 같을 때, this를 붙이면 멤버변수임을 표시
    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

