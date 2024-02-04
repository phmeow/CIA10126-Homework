package hw4;

import java.util.Scanner;

public class Homework4_2 {
    // 請建立一個字串,經過程式執行後,輸入結果是反過來的
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入文字: ");
        String sc = new StringBuilder(scanner.next()).reverse().toString();
        System.out.println(sc);
    }
}
