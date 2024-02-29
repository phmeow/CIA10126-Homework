package hw10;

import hw6.ScannerService;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework10_2 {
    /*
     請設計一隻程式,讓使用者可以輸入一個任意數後, 可以選擇要以下列何種表示方法顯示
     (1)千分位 (2)百分比 (3)科學記號, 而輸入非任意數會顯示提示訊息
     (提示: TestFormatter.java, Java API 文件, 判斷數字可用正規表示法)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);
        int i = 0;
        while (i == 0) {
            System.out.println("請輸入數字：");
            String input = scanner.nextLine();
            if (isANumber(input)) {
                double number = Double.parseDouble(input);
                System.out.println("欲格式化成 (1)千分位 (2)百分比 (3)科學記號: ");
                int option = scannerService.getInputIntegerAndFilter(1, 3);

                switch (option) {
                    case 1 -> formatWithThousandsSeparator(number);
                    case 2 -> formatAsPercentage(number);
                    case 3 -> formatInScientificNotation(number);
                }
                i++;
            } else {
                System.out.println("輸入格式錯誤，請再試一次。");
            }
        }
    }

    public static void formatWithThousandsSeparator(double number) {
        Format formatter = new DecimalFormat("#,###.##");
        System.out.println("千分位表示法: " + formatter.format(number));
    }

    public static void formatAsPercentage(double number) {
        Format formatter = new DecimalFormat("#.##%");
        System.out.println("百分比表示法: " + formatter.format(number));
    }

    public static void formatInScientificNotation(double number) {
        Format formatter = new DecimalFormat("0.###E00");
        System.out.println("科學記號表示法: " + formatter.format(number));
    }

    public static boolean isANumber(String s) {
        return Pattern.matches("-?\\d+(\\.\\d+)?", s);
        /*
         -?   表示符號部分是可選的負號，也就是浮點數可以是負數
         \\.  表示小數點
         \\d+ 表示整數部分: 一個或多個數字（0-9）
        */
    }
}
