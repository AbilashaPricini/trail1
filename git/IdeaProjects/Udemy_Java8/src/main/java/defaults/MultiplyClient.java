package defaults;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Arrays;
import java.util.List;

public class MultiplyClient {
    public static void main(String[] args) {
        Multiplication mul = new MultiplicationImplementation();
        List<Integer> list = Arrays.asList(1, 3, 5);

        System.out.println(mul.multiply(list));
        System.out.println("Default method : " + mul.size(list));
        System.out.println("Static method : " + Multiplication.isEmpty(list));
    }
}
