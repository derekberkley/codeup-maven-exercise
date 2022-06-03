import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class userPrompt {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter something here:");
        String input = scan.nextLine();
        System.out.println("You entered: " + input);
        boolean result = StringUtils.isNumeric(input);
        if (!result) {
            System.out.println(input + " is not a number.");
        } else {
            System.out.println(input + "is a number!");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));
    }
}
