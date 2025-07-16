import java.util.Scanner;

public class Day2_RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String noSpaces = s.replaceAll(" ", "");

        System.out.println("String without spaces: " + noSpaces);
    }
}
