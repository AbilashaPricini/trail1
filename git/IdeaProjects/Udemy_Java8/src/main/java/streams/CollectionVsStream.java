package streams;

import java.util.ArrayList;
import java.util.List;

public class CollectionVsStream {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("abi");
        names.add("subbar");
        names.add("pranika");
        names.add("pranav");

        names.remove(3);
        System.out.println(names);

        //names.stream(). - no remove method available, we can't add/modify/delete stream
    }
}
