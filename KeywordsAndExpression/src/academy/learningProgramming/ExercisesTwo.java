package academy.learningProgramming;

public class ExercisesTwo {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int ZZ = kiloBytes % 1024;
        int YY = (kiloBytes - ZZ) / 1024;
        if(kiloBytes >= 0) {
            System.out.println(kiloBytes + " KB = " + YY + " MB and " + ZZ + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }

}
