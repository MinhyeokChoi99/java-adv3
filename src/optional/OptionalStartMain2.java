package optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain2 {
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
        Optional<String> optName = findNmaById(id);
        String name = optName.orElse("unknown");
        System.out.println("name = " + name.toUpperCase());
    }
    static  Optional<String> findNmaById(long id) {
        String findName = map.get(id);
        Optional<String> optName = Optional.ofNullable(findName);
        return optName;
    }

}
