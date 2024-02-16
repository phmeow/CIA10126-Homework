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
    public int getInputNumberAndFilter(int min, int max) {
        int i;
        try {
            i = Integer.parseInt(scanner.next());
        } catch (NumberFormatException e) {
            System.out.println("你輸入的不是整數, 請輸入整數: ");
            return getInputNumberAndFilter(min, max);
        }
        if (i > max || i < min) {
            System.out.println("輸入的數字不在範圍內, 請重試: ");
            return getInputNumberAndFilter(min, max);
        }
        return i;
    }

    public int getInputNumberAndFilter(int min) {
        return getInputNumberAndFilter(min, Integer.MAX_VALUE);
    }

    public int getInputNumberAndFilter() {
        return getInputNumberAndFilter(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
