package hw3;

import hw6.ScannerService;

import java.util.Scanner;

// 2. 猜數字遊戲: 亂數產生一個0~9的數字, 猜錯會顯示錯誤訊息, 猜對則顯示正確訊息
public class Homework3_2 {
    public static void main(String[] args) {
        int answer = NumberUtils.getRandomNumber(0, 9);
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);

        System.out.print("請輸入整數 0~9: ");
        while (scannerService.getInputIntegerAndFilter(0, 9) != answer) {
            System.out.println("請再試一次! 請輸入整數 0~9: ");
        }
        System.out.println("猜對了, 答案就是 " + answer);
    }
}
