package defaults;

import java.util.List;

public interface Multiplication {
    int multiply(List<Integer> values);

    default int size(List<Integer> integers){
        System.out.println("Interface");
        return integers.size();
    }

    static boolean isEmpty(List<Integer> list){
        return list!=null && list.size()>0;
    }
}
