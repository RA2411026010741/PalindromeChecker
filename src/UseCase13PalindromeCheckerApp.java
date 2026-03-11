import java.util.*;

public class UseCase13PalindromeCheckerApp {

    static boolean stackPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray()) {
            if (c != stack.pop())
                return false;
        }
        return true;
    }

    static boolean dequePalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast()))
                return false;
        }
        return true;
    }

    static boolean recursivePalindrome(String str, int start, int end) {
        if (start >= end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        return recursivePalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean recursiveResult = recursivePalindrome(input, 0, input.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("Stack Result: " + stackResult + " | Time: " + (end1 - start1) + " ns");
        System.out.println("Deque Result: " + dequeResult + " | Time: " + (end2 - start2) + " ns");
        System.out.println("Recursive Result: " + recursiveResult + " | Time: " + (end3 - start3) + " ns");

        sc.close();
    }
}
