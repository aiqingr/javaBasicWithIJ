package academy.learningprogramming;

public class CharAndOthers {

    public static void  main(String[] args) {

        char myChar = 'E';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        String myString = "This is my first string";
        System.out.println("My String is: " + myString);
        myString = myString + ", and there is more!";
        System.out.println(myString);
        String numberString = "10";
        int myInt = 50;
        numberString = numberString + myInt;
        System.out.println(numberString);
        String lastString = "This is my last string";
        lastString = lastString + myInt;
        System.out.println(lastString);
        double doubleNumber = 123.12d;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);
        String testString = "This is a test string: ";
        testString = testString + myInt + doubleNumber;
        System.out.println(testString);
    }
}
