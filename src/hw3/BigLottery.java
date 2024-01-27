package hw3;

public class BigLottery {
    public static int[] randomNumberArray(int min, int max, int size, int unwantedNumber) {
        Integer[] nums = new Integer[size];
        int[] returnNums = new int[size];
        int pickCount = 0;
        pickNumWhile:
        while (pickCount < size) {
            int random = NumberUtils.getRandomNumber(min, max);
            if (String.valueOf(random).contains(String.valueOf(unwantedNumber))) {
                continue;
            }
            for (Integer num : nums) {
                if (null == num) {
                    break;
                }
                if (random == num) {
                    continue pickNumWhile;
                }
            }
            nums[pickCount] = random;
            returnNums[pickCount] = random;
            pickCount++;
        }
        return returnNums;
    }
}
