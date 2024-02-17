package hw7;

import java.io.*;

public class Homework7_1 {
    /*
     請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
     Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
    */
    public static void main(String[] args) {
        String filename = "C:\\Java_downloads\\Sample.txt";
        int countChar = 0;
        int countLine = 0;
        try {
            String str;
            File f1 = new File(filename);
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {
                countChar += str.length();
                countLine++;
            }
            System.out.println(
                    "Sample.txt 檔案共有 "
                            + f1.length()
                            + " 個位元組, "
                            + countChar
                            + " 個字元, "
                            + countLine
                            + " 列資料。");
            br.close();
            fr.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
