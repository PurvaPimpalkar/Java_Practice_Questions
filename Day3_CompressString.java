import java.util.Scanner;

public class Day3_CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder compressed = new StringBuilder();

        int count = 1;
        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1));
                compressed.append(count);
                count = 1;
            }
        }

        System.out.println("Compressed string: " + compressed.toString());

    
    }
}
