package chap_08;

import chap_08.Camera.FactoryCam;
import chap_08.detector.AdvancedFireDetector;
import chap_08.detector.Detectable;
import chap_08.detector.FireDetector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
//        NormalReporter normalReporter = new NormalReporter();
//        normalReporter.report();

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("-------------------");

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------");

        FactoryCam factoryCam = new FactoryCam();

//        factoryCam.setDetector(fireDetector);
//        factoryCam.setReporter(normalReporter);

        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

        // 단일상속 (extends)
    }
}
