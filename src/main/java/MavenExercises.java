import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter a sentence.");
        String userInput = scanner.nextLine();
        System.out.println("userInput is empty, true or false: " + StringUtils.isEmpty(userInput));
        System.out.println("Your input reversed: " + StringUtils.reverse(userInput));
        System.out.println("Your input is numeric true or false: " + StringUtils.isNumeric(userInput));
        System.out.println("Your input with the case swapped: " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverseDelimited(userInput, ',') = " + StringUtils.reverseDelimited(userInput, ','));
        System.out.println("StringUtils.center(userInput, 20, 'T') = " + StringUtils.center(userInput, 20, '*'));

        String myString = "Begin Failure is the greatest Teacher End";
        System.out.println("StringUtils.substringBetween(myString, \"Begin\", \"End\") = " + StringUtils.substringBetween(myString, "Begin", "End"));


    }


}
