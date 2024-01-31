package hw3;

import java.util.Scanner;

// 1. 輸入三個數字,輸出: 是否為三角形, 若是則輸出是什麼三角形
public class Homework3_1 {
    public static void main(String[] args) {
        Scanner inputSideLength = new Scanner(System.in);
        int[] sideLengths = new int[3];
        for (int i = 0; i < sideLengths.length; i++) {
            System.out.println("請依序輸入三個整數, 第" + (i+1) + "個邊長: ");
            sideLengths[i] = NumberUtils.getInputNumberAndFilter(0, inputSideLength);
        }
        int result = checkTriangle(sideLengths[0], sideLengths[1], sideLengths[2]);
        switch (result) {
            case 0 -> System.out.println("這不是三角形!");
            case 1 -> System.out.println("其他三角形");
            case 2 -> System.out.println("等腰三角形");
            case 3 -> System.out.println("正三角形");
            case 4 -> System.out.println("直角三角形");
        }
    }

    /**
     * 判斷是否為三角形
     *
     * @param a 第一個邊長
     * @param b 第二個邊長
     * @param c 第三個邊長
     * @return 0: 不是三角形, 1: 其他, 2: 等腰, 3: 正, 4: 直角, 5: 等腰直角
     */
    public static int checkTriangle(int a, int b, int c) {
        int[] sideLengths = {a, b, c};
        int maxEqualSideLengthCount = 0;
        int sideLengtha;
        for (int i = 0; i < sideLengths.length; i++) {
            sideLengtha = sideLengths[i];
            int otherSideLengthSum = 0;
            int equalSideLengthCount = 0;
            for (int j = 0; j < sideLengths.length; j++) {
                if (i == j) continue;
                int otherSideLength = sideLengths[j];
                otherSideLengthSum += otherSideLength;
                if (sideLengtha == otherSideLength) {
                    equalSideLengthCount++;
                }
            }
            if (otherSideLengthSum <= sideLengtha) {
                return 0; // 不是三角形
            }
            if (equalSideLengthCount > maxEqualSideLengthCount) {
                maxEqualSideLengthCount = equalSideLengthCount;
            }
        }

        if (isRightAngleTriangle(a, b, c)) {
            return 4;
        }

        switch (maxEqualSideLengthCount) {
            case 1 -> { // 等腰三角形
                return 2;
            }
            case 2 -> { // 正三角形
                return 3;
            }
            default -> { // 其他三角形
                return 1;
            }
        }
    }

    /**
     * 判斷是否為直角三角形
     *
     * @param a 邊長1
     * @param b 邊長2
     * @param c 邊長3
     * @return 是否為直角三角形
     */
    private static boolean isRightAngleTriangle(int a, int b, int c) {
        return (a * a + b * b == c * c) || (a * a + c * c == b * b) || (b * b + c * c == a * a);
    }
}
