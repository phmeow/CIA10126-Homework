package hw5;

public class MyRectangle {
    private double width;
    private double depth;

    /**
     * 將收到的引數指定給width屬性
     *
     * @param width 長方形寬
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 將收到的引數指定給depth屬性
     *
     * @param depth 長方形高
     */
    public void setDepth(double depth) {
        this.depth = depth;
    }

    /**
     * 計算該長方形的面積
     *
     * @return 面積
     */
    public double getArea() {
        return width * depth;
    }

    public MyRectangle() {}

    // 傳入的兩個引數會指定給對應的屬性
    public MyRectangle(double width, double depth) {
        setWidth(width);
        setDepth(depth);
    }
}
