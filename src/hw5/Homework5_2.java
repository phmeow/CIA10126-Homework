package hw5;

import hw3.NumberUtils;

public class Homework5_2 {
    /*
    請設計一個方法為randAvg(),
    0~100(含100)的整數亂數中取10個亂數與其平均值並印出
     */
    public static void main(String[] args) {
        randAvg(10);
    }

    /**
     * 從0~100的整數中, 取得一隨機陣列與其元素之平均
     *
     * @param nums 陣列長度
     */
    public static void randAvg(int nums) {
        int[] randomArray = new int[nums];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = NumberUtils.getRandomNumber(0, 100);
        }
        int sum = 0;
        for (int random : randomArray) {
            sum += random;
        }
        int avg = sum / randomArray.length;
        System.out.println("本次亂數結果: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("平均值 = " + avg);
    }
}
