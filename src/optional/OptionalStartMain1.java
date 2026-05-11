package optional;

import java.util.HashMap;
import java.util.Map;

public class OptionalStartMain1 {
    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }

    static void main(String[] args) {
        findAndPrint(1L);
        findAndPrint(3L);
    }
    static void findAndPrint(long id) {
        String name = findNmaById(id);
//        System.out.println("name = " + name.toUpperCase());
        if(name != null) {
            System.out.println("name = " + name.toUpperCase());
        } else {
            System.out.println("unknown");
        }
    }
    static String findNmaById(long id) {
        return map.get(id);
    }

}
