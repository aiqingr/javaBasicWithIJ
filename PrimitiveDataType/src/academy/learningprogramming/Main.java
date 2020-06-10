package academy.learningprogramming;

public class Main {

    public static void main(String[] args) {
//        int myValue = 100000;
        int myMinVal = Integer.MIN_VALUE;
        int myMaxVal = Integer.MAX_VALUE;
        System.out.println("Integer min value is: " + myMinVal);
        System.out.println("Integer max value is: " + myMaxVal);
        System.out.println("Busted max value = " + (myMaxVal + 1));

        byte byteMaxVal = Byte.MAX_VALUE;
        byte byteMinVal = Byte.MIN_VALUE;
        System.out.println("Byte max value is: " + byteMaxVal);
        System.out.println("Byte min value is: " +byteMinVal);
        byte testingNum = (byte) (byteMaxVal / 2);
        System.out.println("Testing result: " + testingNum);

        int myIntValue = 5 / 3;
        float myFloValue = 5f / 3f;
        double myDouValue = 5d / 3d;
        System.out.println("My int value is: " + myIntValue);
        System.out.println("My float value is: " + myFloValue);
        System.out.println("My double value is: " + myDouValue);

    }
}
