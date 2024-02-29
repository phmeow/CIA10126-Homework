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

    /**
     * 判斷整數是否為質數
     *
     * @param number 要判斷的數字
     * @return true: 是質數, false: 不是質數
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
