package hw3;

import java.util.Scanner;

public class NumberUtils {
    /**
     * 隨機產整數
     *
     * @param min 範圍下限
     * @param max 範圍上限
     * @return 隨機產生的數字
     */
    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    /**
     * 檢查輸入的數字
     *
     * @param min 範圍下限
     * @param max 範圍上限
     * @param scanner 輸入數字
     * @return 檢查完的輸入數字
     */
    public static int getInputNumberAndFilter(int min, int max, Scanner scanner) {
        int i;
        try {
            i = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("你輸入的不是整數, 請輸入整數: ");
            return getInputNumberAndFilter(min, max, scanner);
        }
        if (i > max || i < min) {
            System.out.println("輸入的數字不在範圍內, 請重試: ");
            return getInputNumberAndFilter(min, max, scanner);
        }
        return i;
    }

    public static int getInputNumberAndFilter(int min, Scanner scanner) {
        return getInputNumberAndFilter(min, Integer.MAX_VALUE, scanner);
    }
}
