import java.util.regex.Pattern;
import java.util.Scanner;

public class StringUtils {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Something: ");
        String input = scanner.nextLine();

        // check if input is a number
        boolean isNumber = StringUtils.isNumber(input);
        System.out.printf("\"%s\" is %s a number\n", input, isNumber ? "" : "not");

        // flip the case of the string
        String flipped = StringUtils.swapCase(input);
        System.out.printf("Flipped Case: %s\n", flipped);

        // reverse the string
        String reversed = StringUtils.reverse(input);
        System.out.printf("Reversed: %s\n", reversed);
    }

    // check if input is a number
    public static boolean isNumber(String input) {
        return Pattern.matches("-?\\d+(\\.\\d+)?", input);
    }

    // flip the case of the string
    public static String swapCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    // reverse the string
    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
