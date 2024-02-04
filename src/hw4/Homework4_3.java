package hw4;

public class Homework4_3 {
    /*
    有個字串陣列如下 (八大行星):
    {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
    請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
     */
    public static void main(String[] args) {
        String[] planets = {
            "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"
        };
        int vowelNum = 0;
        for (String planet : planets) {
            for (int j = 0; j < planet.length(); j++) {
                switch (planet.charAt(j)) { // 透過索引值取得字串內某一個字元
                    case 'a', 'e', 'i', 'o', 'u' -> vowelNum++;
                }
            }
        }
        System.out.println(vowelNum);
    }
}
