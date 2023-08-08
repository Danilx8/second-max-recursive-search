import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class FunctionTest {
    static Function function;
    static Random random;

    @BeforeAll
    public static void setFunction() {
        function = new Function();
        random = new Random();
    }

    @Test
    public void emptyList() {
        Integer[] array = new Integer[0];
        Assertions.assertNull(function.secondMax(array));
    }

    @Test
    public void singleInt() {
        int value = 10;
        Integer[] array = new Integer[1];
        array[0] = value;

        Assertions.assertEquals(value, function.secondMax(array));
    }

    @Test
    public void secondMaxInHead() {
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE - 1;
        Integer[] array = new Integer[12];
        array[0] = secondMax;
        array[1] = max;
        for (int i = 2; i < array.length; ++i) {
            array[i] = random.nextInt(Integer.MAX_VALUE - 2);
        }

        Assertions.assertEquals(secondMax, function.secondMax(array));
    }

    @Test
    public void secondMaxInTail() {
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE - 1;
        Integer[] array = new Integer[12];
        array[0] = secondMax;
        for (int i = 1; i < array.length - 1; ++i) {
            array[i] = random.nextInt(Integer.MAX_VALUE - 2);
        }
        array[array.length - 1] = max;

        Assertions.assertEquals(secondMax, function.secondMax(array));
    }
}