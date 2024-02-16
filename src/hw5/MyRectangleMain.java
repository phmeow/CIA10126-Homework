package hw5;

public class MyRectangleMain {
    public static void main(String[] args) {
        // (1)
        MyRectangle myRectangle1 = new MyRectangle();
        myRectangle1.setWidth(10);
        myRectangle1.setDepth(20);
        System.out.println(myRectangle1.getArea());

        // (2)
        MyRectangle myRectangle2 = new MyRectangle(10, 20);
        System.out.println(myRectangle2.getArea());
    }
}
