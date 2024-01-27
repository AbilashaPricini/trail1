package defaults;

import java.util.List;

public class MultiplicationImplementation implements Multiplication{
    @Override
    public int multiply(List<Integer> values) {
        return values.stream()
                .reduce(1, (x,y) -> x*y);
    }

    @Override
    public int size(List<Integer> integers) {
        System.out.println("Implementation class");
        return integers.size();
    }
}
