package learningProgramming;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 2.0));
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " Hello!");
        }
        for(int i=2; i<=8; i+=2) {
            System.out.println("10,000 at " + i + "% interest rate = " + calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}
