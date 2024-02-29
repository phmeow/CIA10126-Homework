package hw6;

import java.util.Scanner;

public class ScannerService {
    private final Scanner scanner;

    public ScannerService(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * 檢查輸入的數字
     *
     * @param min 範圍下限
     * @param max 範圍上限
     * @return 檢查完的輸入數字
     */
    public double getInputDoubleAndFilter(double min, double max) {
        double i;
        try {
            i = Double.parseDouble(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("你輸入的不是數字, 請輸入數字: ");
            return getInputDoubleAndFilter(min, max);
        }
        if (i > max || i < min) {
            System.out.println("輸入的數字不在範圍內, 請重試: ");
            return getInputDoubleAndFilter(min, max);
        }
        return i;
    }

    public int getInputIntegerAndFilter(int min, int max) {
        return (int) getInputDoubleAndFilter(min, max);
    }

    public int getInputIntegerAndFilter(int min) {
        return getInputIntegerAndFilter(min, Integer.MAX_VALUE);
    }

    public int getInputIntegerAndFilter() {
        return getInputIntegerAndFilter(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
