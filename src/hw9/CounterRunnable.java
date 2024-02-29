package hw9;

import hw3.NumberUtils;

public class CounterRunnable implements Runnable {
    /*
     開啓2個執行緒模擬饅頭人與詹姆士參加快胃王(???)比賽所做的競賽過程。
     每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
     Sleep時間由亂數產生500~3000之間的毫秒數
    */
    int counter;
    String name;

    public CounterRunnable() {}

    public CounterRunnable(String name) {
        this.name = name;
        this.counter = 0;
    }

    public void run() {
        while (counter < 10) {
            try {
                Thread.sleep(NumberUtils.getRandomNumber(500, 3000));
                counter++;
                System.out.println(name + "吃第 " + counter + " 碗飯");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "吃完了!");
    }
}
