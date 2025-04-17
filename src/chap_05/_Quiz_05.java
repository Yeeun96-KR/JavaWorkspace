package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] size = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        for (int i = 0; i < size.length; i++) {
            System.out.println("사이즈 " + size[i] + " (재고 있음)");


        int[] sizeArray = new int[10];
            for (int j = 0; j < sizeArray.length; j++) {
                sizeArray[j] = 250 + (5 * j);
            }

            for (int sizes : sizeArray) {
                System.out.println("사이즈 " + sizes + " (재고있음)");
            }
        }
    }
}
