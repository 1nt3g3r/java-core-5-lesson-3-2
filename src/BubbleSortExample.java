import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 2, 1, 3, 6, 100, 6, 6, 11, 11};

        sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] values) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for(int i = 0; i < values.length - 1; i++) {
                int current = values[i];
                int next = values[i + 1];

                if (current > next) {
                    values[i + 1] = current;
                    values[i] = next;

                    isSorted = false;
                }
            }
        }
    }
}
