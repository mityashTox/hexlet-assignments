package exercise;

import java.util.*;

// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> keys = new TreeSet<>(map1.keySet());
        Set<String> intersection = new TreeSet<>(map1.keySet());

        keys.addAll(map2.keySet());
        intersection.retainAll(map2.keySet());
        keys.forEach(i -> {
            String value = intersection.contains(i) ? "changed" : "null";
            if (value.equals("changed")) {
                value = map1.get(i).equals(map2.get(i)) ? "un".concat(value) : value;
            } else {
                value = map1.containsKey(i) ? "deleted" : "added";
            }
            result.put(i, value);
        });
        return result;
    }
}
//END
