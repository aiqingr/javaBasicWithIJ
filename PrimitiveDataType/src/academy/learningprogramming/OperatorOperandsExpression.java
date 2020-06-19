package academy.learningprogramming;

import java.sql.SQLOutput;

public class OperatorOperandsExpression {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1+2 = " + result);
        int preResult = result;
        System.out.println("previous result: " + preResult);
        result = result - 1;
        System.out.println("3-1 = " + result);
        System.out.println("check previous result again: " + preResult);
        boolean isAlien = true;
        if(!isAlien) {
            System.out.println("It is not a alien!");
            System.out.println("And I am scared of aliens");
        }

        int firstScore = 100;
        int secondScore = 100;
        if(firstScore == 100 && secondScore >= 100) {
            System.out.println("You got the highest score");
        }

        if(firstScore == 100 && secondScore < 100) {
            System.out.println("You got the good score");
        } else {
            System.out.println("This is final result");
        }

    }
}
