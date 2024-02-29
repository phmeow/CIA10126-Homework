package hw10;

import hw6.ScannerService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Homework10_3 {
    /*
     請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化
     (1)年/月/日 (2)月/日/年 (3)日/月/年 三選一
     而輸入非指定日期數字格式會顯示出提示訊息
     (提示:TestFormatter.java, Java API文件,判斷格式可用正規表示法)
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);
        while (true) {
            System.out.println("請輸入日期(年月日，例如20110131): ");
            String dateInput = scanner.nextLine();
            if (isValidDateFormat(dateInput)) {
                System.out.println("請選擇要輸出的日期格式: (1)年/月/日 (2)月/日/年 (3)日/月/年: ");
                int option = scannerService.getInputIntegerAndFilter(1, 3);
                switch (option) {
                    case 1 -> formatDate(dateInput, "年/月/日");
                    case 2 -> formatDate(dateInput, "月/日/年");
                    case 3 -> formatDate(dateInput, "日/月/年");
                }
                break;
            } else {
                System.out.println("日期格式不正確/日期不存在，請再輸入一次！");
            }
        }
    }

    public static boolean isValidDateFormat(String dateInput) {
        boolean regex =
                Pattern.matches("\\d{4}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])", dateInput);
        if (regex) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
            LocalDate localDate = LocalDate.parse(dateInput, formatter);
            return localDate.format(formatter).equals(dateInput);
        } else {
            return false;
        }
    }

    public static void formatDate(String dateInput, String format) {
        String year = dateInput.substring(0, 4);
        String month = dateInput.substring(4, 6);
        String day = dateInput.substring(6, 8);
        String formattedDate = format
                .replace("年", year)
                .replace("月", month)
                .replace("日", day);
        System.out.println(format + ": " + formattedDate);
    }
}
