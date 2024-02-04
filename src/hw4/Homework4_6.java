package hw4;

public class Homework4_6 {
    public static void main(String[] args) {
        int[][] grades = {
            {10, 35, 40, 100, 90, 85, 75, 70},
            {37, 75, 77, 89, 64, 75, 70, 95},
            {100, 70, 79, 90, 75, 70, 79, 90},
            {77, 95, 70, 89, 60, 75, 85, 89},
            {98, 70, 89, 90, 75, 90, 89, 90},
            {90, 80, 100, 75, 50, 20, 99, 75}
        };
        int[] highestScoreCount = new int[8];

        for (int[] testNum : grades) {
            int highestScore = testNum[0];
            for (int score : testNum) {
                if (score > highestScore) {
                    highestScore = score;
                }
            }
            for (int k = 0; k < highestScoreCount.length; k++) {
                if (testNum[k] == highestScore) {
                    highestScoreCount[k]++;
                }
            }
        }

        for (int i = 0; i < highestScoreCount.length; i++) {
            System.out.println((i + 1) + " 號同學考最高分的次數為 " + highestScoreCount[i] + " 次");
        }
    }
}
