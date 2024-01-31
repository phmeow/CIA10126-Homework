package hw3;

public class RandomArrays {
    /**
     * 隨機數字陣列
     *
     * @param min 範圍下限
     * @param max 範圍上限
     * @param size 選幾個數字
     * @param unwantedNumber 不想要出現的數字(1~9)
     * @return 一組含6個數字的陣列
     */
    public static int[] randomNumberArray(int min, int max, int size, int unwantedNumber) {
        Integer[] nums = new Integer[size];
        // nums元素初始值是null, 是裝剛挑出來的數字(為了要排除0的問題，因為int array的元素預設值是0)
        int[] returnNums = new int[size]; // returnNums 裝最後要送出的數字
        int pickCount = 0;
        pickNumWhile: // while的命名, 為了讓for裡的continue知道要continue掉哪一層迴圈
        while (pickCount < size) { // 如果array的空位還沒放滿就會繼續跑while
            int random = NumberUtils.getRandomNumber(min, max);
            if (String.valueOf(random).contains(String.valueOf(unwantedNumber))) {
                continue; // 回到while
            }
            for (Integer num : nums) {
                if (null == num) {
                    break; // null表示陣列中該位置還沒放進數字, 離開for迴圈直接加入array中
                }
                if (random == num) { // 選過了
                    continue pickNumWhile; // 回到外層迴圈重新隨機一次
                }
            }
            nums[pickCount] = random;
            returnNums[pickCount] = random;
            pickCount++;
        }
        return returnNums;
    }
}
