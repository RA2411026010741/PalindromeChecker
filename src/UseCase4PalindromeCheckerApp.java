import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();

        // Convert string to character array
        char[] charArray = inputString.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}