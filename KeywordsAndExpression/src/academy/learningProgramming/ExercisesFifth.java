package academy.learningProgramming;

public class ExercisesFifth {
    public static void main(String[] args) {
        boolean testingOne = areEqualByThreeDecimalPlaces(1.234, 1.2345);
        System.out.println(testingOne);
        boolean testingTwo = areEqualByThreeDecimalPlaces(1.2, 1.234);
        System.out.println(testingTwo);
    }

    public static boolean areEqualByThreeDecimalPlaces(double decimalNumOne, double decimalNumTwo) {
        int firstNum1 = (int)decimalNumOne;
        int secondNum1 = (int)decimalNumTwo;
        int firstNum2 = ((int)(decimalNumOne*10)) % 10;
        int secondNum2 = ((int)(decimalNumTwo*10)) % 10;
        int firstNum3 = ((int)(decimalNumOne*100)) % 10;
        int secondNum3 = ((int)(decimalNumTwo*100)) % 10;
        int firstNum4 = ((int)(decimalNumOne*1000)) % 10;
        int secondNum4 = ((int)(decimalNumTwo*1000)) % 10;
        if(firstNum1 == secondNum1 && firstNum2 == secondNum2 && firstNum3 == secondNum3 && firstNum4 == secondNum4) {
            return true;
        } else {
            return false;
        }
    }
}
