package hw10;

import hw3.NumberUtils;
import java.util.HashSet;
import java.util.Set;

public class Homework10_1 {
    // 用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否為質數 (Math類別)

    public static void main(String[] args) {
        Set<Integer> fiveInts = new HashSet<>();
        while (fiveInts.size() < 5) {
            fiveInts.add(NumberUtils.getRandomNumber(1, 100));
        }
        for (int fiveInt : fiveInts) {
            System.out.print(fiveInt);
            if (NumberUtils.isPrime(fiveInt)) {
                System.out.println("是質數");
            } else {
                System.out.println("不是質數");
            }
        }
    }
}
