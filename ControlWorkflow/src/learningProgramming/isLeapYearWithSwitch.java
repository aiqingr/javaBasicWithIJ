package learningProgramming;

public class isLeapYearWithSwitch {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        } else if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void getDaysInMonth(int month, int year) {
        boolean isLeapYear = isLeapYear(year);
        switch() {

        }
    }
}
