import java.util.Scanner;
public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int minimum = findMinimum(n, arr);
        System.out.println("Minimum number: " + minimum);

        input.close();
    }

    public static int findMinimum(int n, int[] arr) {
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}