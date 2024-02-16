package hw3;

import hw6.ScannerService;

import java.util.Scanner;

// 阿文很喜歡簽大樂透(1~49), 依心情決定討厭哪個數字
// 輸入不想要的數字(1~9), 畫面會顯示他可以選擇的號碼與總數
public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);

        System.out.print("請輸入討厭的數字(1~9): ");
        int unwantedNum = scannerService.getInputNumberAndFilter(1, 9);
        int row = 0;
        System.out.print("阿文可選：");
        for (int i = 1; i < 50; i++) {
            String iStr = String.valueOf(i);
            if (!iStr.contains(String.valueOf(unwantedNum))) {
                System.out.print(iStr + " ");
                row++;
            }
        }
        System.out.println();
        System.out.println("共 " + row + " 個數字");
    }
}
