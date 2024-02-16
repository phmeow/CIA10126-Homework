package hw6;

public class Calculator {

    /**
     * 計算x的y次方
     *
     * @param x 底數
     * @param y 指數
     * @return 運算結果
     * @throws CalException 自定義例外訊息
     */
    public static int powerXY(int x, int y) throws CalException {
        if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義!");
        } else if (y < 0) {
            throw new CalException("次方為負值, 結果回傳不為整數!");
        } else {
            return (int) Math.pow(x, y);
        }
    }
}
