package chap_08;

import chap_07.BlackBox;
import chap_07.BlackBoxRefurbish;
import chap_07.*;

import java.util.Objects;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
//        b1.resolution = "FHD"; // default : 같은 패키지 내에서만 사용 가능
//        b1.price = 200000; // private
//        b1.color = "블랙"; // protected

        // public이 아니기 때문에 패키지 밖에서는 가지고 올 수 없음
//        A a = new A();

    }
}
