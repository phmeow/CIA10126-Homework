package hw4;

public class Homework4_1 {
    public static void main(String[] args) {
        // 輸出此陣列所有元素的平均值與大於平均值的元素
        int[] numArray = {29, 100, 30, 41, 50, 8, 66, 77, 95, 15};
        int arraySum = 0;
        for (int num : numArray) {
            arraySum += num;
        }
        int arrayAvg = arraySum / numArray.length;
        System.out.print("平均 " + arrayAvg + ", 分別為: ");
        for (int num : numArray) {
            if (num > arrayAvg) {
                System.out.print(num + " ");
            }
        }
    }
}
