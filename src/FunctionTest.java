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

    @Test
    public void twoValues() {
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE - 1;
        Integer[] array = new Integer[2];
        array[0] = secondMax;
        array[1] = max;

        Assertions.assertEquals(secondMax, function.secondMax(array));
    }

    @Test
    public void threeValues() {
        int max = 3;
        int secondMax = 2;
        Integer[] array = new Integer[3];
        array[0] = secondMax;
        array[1] = 1;
        array[2] = max;

        Assertions.assertEquals(secondMax, function.secondMax(array));
    }

    @Test
    public void fourValues() {
        int max = 11;
        int secondMax = 10;
        Integer[] array = new Integer[4];
        array[0] = secondMax;
        for (int i = 1; i < array.length - 1; ++i) {
            array[i] = random.nextInt(9);
        }
        array[array.length - 1] = max;

        Assertions.assertEquals(secondMax, function.secondMax(array));
    }
}