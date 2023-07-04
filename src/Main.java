public class Main {
    public static double calculateAverage(int n, int[] arr) {
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = sum / n;
        return average;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {3, 2, 4, 1};

        double average = calculateAverage(n, arr);
        System.out.println("Average: " + average);
    }
}