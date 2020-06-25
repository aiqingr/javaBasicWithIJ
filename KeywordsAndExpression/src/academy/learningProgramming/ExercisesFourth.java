package academy.learningProgramming;

public class ExercisesFourth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1700));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2016));
        System.out.println(isLeapYear(1700));
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year >= 9999) {
            return false;
        } else if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else  {
                return true;
            }
        } else {
            return false;
        }
    }
}
