import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90,22,99,120};

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(numbers));
    }
}

