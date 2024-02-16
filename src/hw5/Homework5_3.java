package hw5;

public class Homework5_3 {
    /*
    利用Overloading,設計兩個方法int maxElement(int x[][])與
    double maxElement(double x[][]),可以找出二維陣列的最大值並回傳
     */

    public static void main(String[] args) {
        int[][] intMatrix = {{1, 6, 3}, {9, 5, 2}};
        double[][] doubleMatrix = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
        ArrayOperations arrayOperations = new ArrayOperations();
        System.out.println(arrayOperations.maxElement(intMatrix));
        System.out.println(arrayOperations.maxElement(doubleMatrix));
    }
}
