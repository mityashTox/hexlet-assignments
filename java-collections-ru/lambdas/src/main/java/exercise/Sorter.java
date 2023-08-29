package exercise;

import org.apache.commons.lang3.StringUtils;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user ->user.get("gender").equals("male"))
                .sorted((user1, user2) -> {
                    String birthday1Str = StringUtils.replaceChars(user1.get("birthday"), "-", "");
                    String birthday2Str = StringUtils.replaceChars(user2.get("birthday"), "-", "");
                    int birthday1 = Integer.parseInt(birthday1Str);
                    int birthday2 = Integer.parseInt(birthday2Str);
                    return Integer.compare(birthday1, birthday2);
        })
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
    }
// END
