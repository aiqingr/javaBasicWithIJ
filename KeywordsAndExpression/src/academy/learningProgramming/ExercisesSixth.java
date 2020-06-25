package academy.learningProgramming;

public class ExercisesSixth {
    public static void main(String[] args) {
        boolean firstResult = hasEqualSum(1, -1, 0);
        boolean secondResult = hasEqualSum(20, 19, 1);
        System.out.println(firstResult);
        System.out.println(secondResult);
    }

    public static boolean hasEqualSum(int firstNum, int secondNum, int thirdNum) {
        if(firstNum + secondNum == thirdNum) {
            return true;
        } else {
            return false;
        }
    }
}
