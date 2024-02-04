package hw4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Homework4_5 {
    /*
    請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
    例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入西元年月日 (yyyyMMdd): ");
        LocalDate localDate = null; // 日期格式
        while (null == localDate) {
            try {
                String dateInput = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd"); // 要轉成的格式
                localDate = LocalDate.parse(dateInput, formatter); // 把輸入的字串轉成我要的日期格式
                if (!localDate.format(formatter).equals(dateInput)) { // 排除錯誤的日期
                    localDate = null;
                    System.out.println("輸入日期不存在, 請重試: ");
                }
            } catch (DateTimeParseException e) {
                System.out.println("輸入日期格式錯誤, 請重試: ");
            }
        }

        int dayOfYear = localDate.getDayOfYear();
        System.out.println("輸入的日期是該年的第 " + dayOfYear + " 天");
    }
}
