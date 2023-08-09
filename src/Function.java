import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Function {
    public static int secondMax(Integer[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Длина массива не может быть меньше двух");
        }

        return recursiveSearch(array, array.length - 1, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    private static int recursiveSearch(Integer[] array, int index, int largest, int secondLargest) {
        if (index < 0) {
            return secondLargest;
        }

        int current = array[index];

        if (current > largest) {
            secondLargest = largest;
            largest = current;
        } else if (current < largest && current > secondLargest) {
            secondLargest = current;
        }

        return recursiveSearch(array, index - 1, largest, secondLargest);
    }

}
