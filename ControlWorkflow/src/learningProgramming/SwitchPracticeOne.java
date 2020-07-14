package learningProgramming;

public class SwitchPracticeOne {
    public static void main(String[] args) {
        char switchValue = 'A';
        switch (switchValue) {
            case 'A':
                System.out.println("Switch value A has been found.");
                break;
            case 'B':
                System.out.println("Switch value B has been found.");
                break;
            case 'C':
                System.out.println("Switch value C has been found.");
                break;
            case 'D':
                System.out.println("Switch value D has been found.");
                break;
            case 'E':
                System.out.println("Switch value E has been found.");
                break;
            default:
                System.out.println("Value has not been found.");
                break;
        }
    }
}
