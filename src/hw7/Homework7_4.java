package hw7;

import java.io.*;

public class Homework7_4 {
    /*
    請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到 C:\data\Object.ser裡。
    注意物件寫入需注意的事項,若 C:\內沒有 data 資料夾,請用程式新增這個資料夾
     */
    public static void main(String[] args) throws Exception {
        File dir = new File("C:\\data");
        if (!dir.exists()) {
            dir.mkdir();
        }
        File file = new File("C:\\data\\Object.ser");
        Dog dog = new Dog("white");
        Cat cat = new Cat("Black");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(dog);
        oos.writeObject(cat);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(file.getName() + "檔案內容如下: ");
        System.out.println("-----------------------------");
        try {
            while (true) {
                Object obj = ois.readObject();
                if (obj instanceof Dog) {
                    ((Dog) obj).speak();
                } else if (obj instanceof Cat) {
                    ((Cat) obj).speak();
                }
                System.out.println("-----------------------------");
            }
        } catch (EOFException e) {
            System.out.println("資料讀取完畢！");
        }

        ois.close();
        fis.close();
    }
}
