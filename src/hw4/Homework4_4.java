package hw4;

import java.util.Scanner;

public class Homework4_4 {
    /*
    員編:  25   32  8   19   27
    現金: 2500 800 500 1000 1200
    請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
    並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
     */
    public static void main(String[] args) {
        String[] employeeId = {"25", "32", "8", "19", "27"};
        int[] cash = {2500, 800, 500, 1000, 1200};
        System.out.println("請輸入欲借金額: ");
        Scanner scanner = new Scanner(System.in);
        int need = scanner.nextInt();
        StringBuilder result = new StringBuilder("有錢可借的員工編號: ");
        int counter = 0;
        for (int i = 0; i < cash.length; i++) {
            if (need <= cash[i]) {
                result.append(employeeId[i]);
                result.append(" ");
                counter++;
            }
        }
        System.out.print(result);
        if (counter == 0) {
            System.out.println("無");
        } else {
            System.out.println("共 " + counter + " 人!");
        }
    }
}
