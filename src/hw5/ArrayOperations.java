package hw5;

public class ArrayOperations {

    /**
     * 得到int二維陣列中元素最大值
     *
     * @param matrix 一個int二維陣列
     * @return 陣列中元素的最大值
     */
    public int maxElement(int[][] matrix) {
        int max = matrix[0][0];
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }

    /**
     * 得到double二維陣列中元素最大值
     *
     * @param matrix 一個double二維陣列
     * @return 陣列中元素的最大值
     */
    public double maxElement(double[][] matrix) {
        double max = matrix[0][0];
        for (double[] doubles : matrix) {
            for (double anDouble : doubles) {
                if (anDouble > max) {
                    max = anDouble;
                }
            }
        }
        return max;
    }
}
