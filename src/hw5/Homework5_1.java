package hw5;

import java.util.Scanner;

public class Homework5_1 {
    /*
     請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,
     即會印出對應的*長方形
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入長方形寬度: ");
        int width = sc.nextInt();
        System.out.println("請輸入長方形高度: ");
        int height = sc.nextInt();
        starSquare(width, height);
    }

    /**
     * 輸出*長方形
     *
     * @param width 長方形寬度
     * @param height 長方形高度
     */
    public static void starSquare(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
