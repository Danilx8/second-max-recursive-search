import java.util.List;

public class Main {
    public Integer secondMax(List<Integer> values) {
        if (values.size() == 0) return null;
        if (values.size() == 1) return values.get(0);

        if (values.size() == 2) return Math.min(values.get(0), values.get(1));
        Integer minimalValue = Math.min(values.get(0), values.get(1));

        values.remove(minimalValue);
        if (minimalValue > values.get(values.get(values.size() - 1))) {
            values.add(minimalValue);
        }

        return secondMax(values);
    }

    public static void main(String[] args) {

    }
}