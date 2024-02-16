package hw3;

import hw6.ScannerService;

import java.util.Scanner;

// 進階功能: 產生0~100亂數, 每次猜就會提示你是大於還是小於正確答案
public class Homework3_2Advanced {
    public static void main(String[] args) {
        int answer = NumberUtils.getRandomNumber(0, 100);
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);

        System.out.print("請輸入整數 0~100: ");
        int guessNum = scannerService.getInputNumberAndFilter(0, 100);
        while (guessNum != answer) {
            if (guessNum > answer) {
                System.out.println("大於正確答案, 請再試一次! 請輸入整數 0~100: ");
            } else {
                System.out.println("小於正確答案, 請再試一次! 請輸入整數 0~100: ");
            }
            guessNum = scannerService.getInputNumberAndFilter(0, 100);
        }
        System.out.println("猜對了, 答案就是 " + answer);
    }
}
