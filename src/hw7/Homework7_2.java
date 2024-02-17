package hw7;

import hw3.RandomArrays;

import java.io.*;

public class Homework7_2 {
    /*
     請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡
     (請使用 append 功能讓每次執行結果都能被保存起來)
    */
    public static void main(String[] args) {
        try {
            int[] rArray = RandomArrays.randomNumberArray(1, 1000, 10);
            String filename = "C:\\Java_downloads\\Data.txt";

            FileOutputStream fos = new FileOutputStream(filename, true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintStream ps = new PrintStream(bos);

            for (int num : rArray) {
                ps.print(num + " ");
            }
            ps.println();

            ps.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
