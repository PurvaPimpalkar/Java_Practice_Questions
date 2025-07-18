import java.util.LinkedHashMap;
import java.util.Scanner;

public class Day2_NonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, map.getOrDefault(c, 0) + 1);
        }


        for (char c : charCount.keySet()) {
            if (map.get(c) == 1) {
                System.out.println("First non-repeating character is: " + c);
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
