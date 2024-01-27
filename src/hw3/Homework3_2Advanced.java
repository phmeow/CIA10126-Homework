package hw3;

import java.util.Scanner;

// 進階功能: 產生0~100亂數, 每次猜就會提示你是大於還是小於正確答案
public class Homework3_2Advanced {
    public static void main(String[] args) {
        int answer = NumberUtils.getRandomNumber(0, 100);
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("請輸入整數 0~100: ");
        int guessNum = NumberUtils.getInputNumberAndFilter(0, 100, inputScanner);
        while (guessNum != answer) {
            if (guessNum > answer) {
                System.out.println("大於正確答案, 請再試一次! 請輸入整數 0~100: ");
            } else {
                System.out.println("小於正確答案, 請再試一次! 請輸入整數 0~100: ");
            }
            guessNum = NumberUtils.getInputNumberAndFilter(0, 100, inputScanner);
        }
        System.out.println("猜對了, 答案就是 " + answer);
    }
}
