package academy.learningProgramming;

public class ExercisesOne {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(75.114));
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour/1.609);
        }
     }

     public static void printConversion(double kilometersPerHour) {

     }
}
