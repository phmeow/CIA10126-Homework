package hw3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        int answer = NumberUtils.getRandomNumber(0, 9);
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("請輸入整數 0~9: ");
        while (NumberUtils.getInputNumberAndFilter(0, 9, inputScanner) != answer) {
            System.out.println("請再試一次! 請輸入整數 0~9: ");
        }
        System.out.println("猜對了, 恭喜發財~");
    }
}
