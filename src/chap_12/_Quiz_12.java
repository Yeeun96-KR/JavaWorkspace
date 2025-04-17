package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable product1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("A 상품 준비 " + i + "/5");
                }
                System.out.println(" -- A 상품 준비 완료 --");
            }
        };

        Runnable product2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            System.out.println(" -- B 상품 준비 완료 --");
        };

        Thread productThread1 = new Thread(product1);
        Thread productThread2 = new Thread(product2);

        productThread1.start();
        productThread2.start();

//        while(productThread1.isAlive() || productThread2.isAlive()) {
//        }

        try {
            productThread1.join();
            productThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setProduct();
    }

    public class productThread extends Thread {
        @Override
        public void run() {
            super.run();
        }
    }

    public static void setProduct() {
        System.out.println(" == 세트 상품 포장 시작 == ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5");
        }
        System.out.println(" == 세트 상품 포장 완료 == ");
    }
}


