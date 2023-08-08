import java.util.ArrayList;
import java.util.List;

public class Function {
    public Integer secondMax(Integer[] values) {
        if (values.length == 0) return null;
        if (values.length == 1) return values[0];

        List<Integer> lesserValues = new ArrayList<>();
        List<Integer> greaterValues = new ArrayList<>();
        for (int i = 1; i < values.length; ++i) {
            if (values[i] < values[0]) {
                lesserValues.add(values[i]);
            } else {
                greaterValues.add(values[i]);
            }
        }

        if (lesserValues.size() >= values.length - 1) {
            return secondMax(lesserValues.toArray(new Integer[0]));
        } else if (lesserValues.size() + 1 == values.length - 1) {
            return values[0];
        } else {
            return secondMax(greaterValues.toArray(new Integer[0]));
        }
    }
}
