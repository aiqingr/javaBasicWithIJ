package academy.learningProgramming;

public class SecondAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int min, int sec) {
        if(min >= 0 && (sec >= 0 && sec <=59)) {
            int hour = min / 60;
            int realMin = min % 60;
            return hour + "h " + realMin + "m " + sec + "s";
        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int sec) {
        if(sec > 0) {
            int getMin = sec / 60;
            int realSec = sec % 60;
            return getDurationString(getMin, realSec);
        } else {
            return "Invalid value";
        }
    }
}
