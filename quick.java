import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(numbers, low, high);
            quickSort(numbers, low, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int smallerIndex = low - 1;

        for (int current = low; current < high; current++) {
            if (numbers[current] <= pivot) {
                smallerIndex++;
                int temp = numbers[smallerIndex];
                numbers[smallerIndex] = numbers[current];
                numbers[current] = temp;
            }
        }

        int temp = numbers[smallerIndex + 1];
        numbers[smallerIndex + 1] = numbers[high];
        numbers[high] = temp;
        return smallerIndex + 1;
    }
}
