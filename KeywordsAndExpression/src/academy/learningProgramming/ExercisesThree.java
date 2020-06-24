package academy.learningProgramming;

public class ExercisesThree {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking && ((hourOfDay >=0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23))) {
            return true;
        } else {
            return false;
        }
    }
}
