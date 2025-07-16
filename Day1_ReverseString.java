import java.util.Scanner;
 class Day1_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
         
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        
        String reversed = new String(arr);
        
        System.out.println("Reversed string: " + reversed);
    }
}
