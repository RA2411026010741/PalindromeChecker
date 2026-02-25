import java.util.Scanner;

/**
 * UseCase2PalindromeCheckerApp
 * Version 2.0
 *
 * Objective:
 * Accept user input and check whether it is a palindrome.
 */

public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter a word to check if it is a palindrome:");
        String word = scanner.nextLine();

        // Reverse the string
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reversedWord)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Close scanner
        scanner.close();

        System.out.println("Program executed successfully.");
    }
}