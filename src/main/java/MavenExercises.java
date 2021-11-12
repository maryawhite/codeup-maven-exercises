import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercises {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please enter a sentence.");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println("userInput is empty, true or false: " + StringUtils.isEmpty(userInput));
        System.out.println("Your input reversed: " + StringUtils.reverse(userInput));
        System.out.println("Your input is numeric true or false: " + StringUtils.isNumeric(userInput));
        System.out.println("Your input with the case swapped: " + StringUtils.swapCase(userInput));
        System.out.println("StringUtils.reverseDelimited(userInput, ',') = " + StringUtils.reverseDelimited(userInput, ','));

    }


}
