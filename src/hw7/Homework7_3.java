package hw7;

import java.io.*;

public class Homework7_3 {
    /*
     請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
     呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案
    */
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Java_downloads\\test1.txt");
        File file2 = new File("C:\\Java_downloads\\test2.txt");
        copyFile(file1, file2);
    }

    public static void copyFile(File file1, File file2) throws IOException {
        File inputFile = new File(String.valueOf(file1));
        File outputFile = new File(String.valueOf(file2));
        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        int c;
        while ((c = in.read()) != -1) {
            out.write(c);
        }

        out.close();
        in.close();
    }
}
