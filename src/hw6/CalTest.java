package hw6;

import java.util.Scanner;

public class CalTest {
    public static void main(String[] args) throws CalException {
        Scanner scanner = new Scanner(System.in);
        ScannerService scannerService = new ScannerService(scanner);
        int i = 0;
        while (i == 0) {
            System.out.println("請輸入底數x: ");
            int xInt = scannerService.getInputNumberAndFilter();
            System.out.println("請輸入指數y: ");
            int yInt = scannerService.getInputNumberAndFilter();
            try {
                System.out.println(xInt + " 的 " + yInt + " 次方是 " + Calculator.powerXY(xInt, yInt));
                i++;
            } catch (CalException cE) {
                System.out.println(cE.getMessage());
            }
        }
    }
}
