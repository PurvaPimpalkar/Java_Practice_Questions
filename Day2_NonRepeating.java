import java.util.LinkedHashMap;
import java.util.Scanner;

public class Day2_NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Use LinkedHashMap to maintain insertion order
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character
        for (char c : charCount.keySet()) {
            if (charCount.get(c) == 1) {
                System.out.println("First non-repeating character is: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
