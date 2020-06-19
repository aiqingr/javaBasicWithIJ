package academy.learningprogramming;

public class TestLearning {

    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double remainder = (firstValue + secondValue * 100.00d) % 40.00d;
        boolean result = (remainder == 0) ? true : false;
        System.out.println(result);
        if(!result) {
            System.out.println("Got some remainder");
        }
    }
}
