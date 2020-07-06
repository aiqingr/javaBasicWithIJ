package learningProgramming;

public class Main {

    public static void main(String[] args) {
	    int value = 1;
        if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was 3");
        }

        int switchValue = 1;
        switch(switchValue) {
            case 11:
                System.out.println("Value was A");
                break;

            case 21:
                System.out.println("Value was B");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }
}
