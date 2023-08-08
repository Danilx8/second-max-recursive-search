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
        List<Integer> list = new ArrayList<>();
        Assertions.assertNull(function.secondMax(list));
    }

    @Test
    public void singleInt() {
        int value = 10;
        List<Integer> list = new ArrayList<>();
        list.add(value);

        Assertions.assertEquals(value, function.secondMax(list));
    }

    @Test
    public void secondMaxInHead() {
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE - 1;
        List<Integer> list = new ArrayList<>();
        list.add(secondMax);
        list.add(max);
        for (int i = 0; i < 10; ++i) {
            list.add(random.nextInt(Integer.MAX_VALUE - 2));
        }

        Assertions.assertEquals(secondMax, function.secondMax(list));
    }

    @Test
    public void secondMaxInTail() {
        int max = Integer.MAX_VALUE;
        int secondMax = Integer.MAX_VALUE - 1;
        List<Integer> list = new ArrayList<>();
        list.add(max);
        for (int i = 0; i < 10; ++i) {
            list.add(random.nextInt(Integer.MAX_VALUE - 2));
        }
        list.add(secondMax);

        Assertions.assertEquals(secondMax, function.secondMax(list));
    }
}