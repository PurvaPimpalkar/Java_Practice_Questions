
import java.util.Scanner;

public class Day3_RotateArray {
    
    static void rotateByK(int[] arr, int n) {
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter K: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            rotateByK(arr, n);
        }

        System.out.print("Array after left rotation: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
