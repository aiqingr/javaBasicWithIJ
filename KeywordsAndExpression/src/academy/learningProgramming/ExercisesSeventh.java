package academy.learningProgramming;

public class ExercisesSeventh {
    public static void main(String[] args) {
        boolean firstResult = hasTeen(1,2,3);
        boolean secondResult = hasTeen(1,13,11);
        System.out.println(firstResult);
        System.out.println(secondResult);
    }

    public static boolean hasTeen(int firstNum, int secondNum, int thirdNum) {
        if((firstNum >= 13 && firstNum <=19) || (secondNum >= 13 && secondNum <=19) || (thirdNum >= 13 && thirdNum <=19)) {
            return true;
        } else {
            return false;
        }
    }

}
