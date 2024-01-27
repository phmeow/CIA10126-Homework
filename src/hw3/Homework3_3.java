package hw3;

import java.util.Scanner;

public class Homework3_3 {
    /**
     * 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4, 但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),
     * 畫面會顯示他可以選擇的號碼與總數
     */
    public static void main(String[] args) {
        Scanner inputUnwantedNum = new Scanner(System.in);
        System.out.print("請輸入討厭的數字(1~9): ");
        int unwantedNum = NumberUtils.getInputNumberAndFilter(1, 9, inputUnwantedNum);
        int[] computerNumberSelection = BigLottery.randomNumberArray(1, 49, 6, unwantedNum);
        for (int i = 0; i < 6; i++) {
            System.out.print(computerNumberSelection[i] + " ");
        }
    }
}
