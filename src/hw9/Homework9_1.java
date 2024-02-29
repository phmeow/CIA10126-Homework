package hw9;

public class Homework9_1 {
    /*
    饅頭人與詹姆士參加快胃王(???)比賽, 要吃十碗白飯, 吃完一碗就跳提示, 全部吃完結束比賽。
     */

    public static void main(String[] args) {
        CounterRunnable r1 = new CounterRunnable("饅頭人");
        Thread player1 = new Thread(r1);
        CounterRunnable r2 = new CounterRunnable("詹姆士");
        Thread player2 = new Thread(r2);

        System.out.println("-----大胃王快食比賽開始!-----");
        player1.start();
        player2.start();

        try {
            player1.join();
            player2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("-----大胃王快食比賽結束!-----");
    }
}
