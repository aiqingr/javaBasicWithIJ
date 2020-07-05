package academy.learningProgramming;

public class ExerciseNine {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            int totalDays = (int) minutes/(60 * 24);
            int days =  totalDays % 365;
            int years = totalDays / 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}
