package stream.collectors;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors2Map {

    static void main(String[] args) {
        Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Tomamto").collect(Collectors.toMap(name -> name, name -> name.length()));
        System.out.println("map1 = " + map1);

        Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Tomamto").collect(Collectors.toMap(name -> name, name -> name.length(), (oldVal, newVal) -> oldVal + newVal));
        System.out.println(map2);

        Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Tomamto").collect(Collectors.toMap(name -> name, name -> name.length(), (oldVal, newVal) -> oldVal + newVal, LinkedHashMap::new));
        System.out.println("map3 = " + map3.getClass().getSimpleName());

    }
}
