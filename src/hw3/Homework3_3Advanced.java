package hw3;

import hw6.ScannerService;

import java.util.Scanner;

// 阿文很喜歡簽大樂透(1~49), 依心情決定討厭哪個數字
// 輸入不想要的數字(1~9), 直接亂數印出6個號碼且不得重複
public class Homework3_3Advanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);

        System.out.print("請輸入討厭的數字(1~9): ");
        int unwantedNum = scannerService.getInputIntegerAndFilter(1, 9);
        int[] computerNumberSelection = RandomArrays.randomNumberArray(1, 49, 6, unwantedNum);
        for (int i = 0; i < 6; i++) {
            System.out.print(computerNumberSelection[i] + " ");
        }
    }
}
