package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int purchaseTime = 21;
        boolean availability = false;

        try {
            if (purchaseTime < 20) {
                throw new purchaseTimeException("상품 구매 가능 시간이 아닙니다.");
            } else {
                System.out.println("상품 구매를 완료하였습니다.");
            }
            if (availability == false) {
                throw new outOfStock("해당 상품은 매진되었습니다.");
            } else {
                System.out.println("상품 구매를 완료하였습니다.");
            }
        } catch (purchaseTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (outOfStock e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }

        System.out.println("-----------------------");

        int errorCode = 2;
        try {
            if (errorCode == 0) {
                System.out.println("상품 구매를 완료하였습니다.");
            } else if (errorCode == 1) {
                throw new purchaseTimeException("상품 구매 가능 시간이 아닙니다.");
            } else if (errorCode == 2) {
                throw new outOfStock("해당 상품은 매진되었습니다.");
            }
        } catch (purchaseTimeException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (outOfStock e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요.");
        }
    }
}

class purchaseTimeException extends Exception {
    public purchaseTimeException(String message) {
        super(message);
    }
}

class outOfStock extends Exception {
    public outOfStock(String message) {
        super(message);
    }
}