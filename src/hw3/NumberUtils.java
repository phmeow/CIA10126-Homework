package hw3;

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
}
