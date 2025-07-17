import java.util.Scanner;

public class Day3_DigitDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = 0;
        int smallest = 9;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }

            num = num / 10;
        }

        int difference = largest - smallest;
        System.out.println("Difference between largest and smallest digits: " + difference);

    
    }
}
