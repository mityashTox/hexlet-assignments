package exercise;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

// BEGIN
class App {

    public static int getCountOfFreeEmails(List<String> lists) {
        return (int) lists.stream()
                .filter(list -> StringUtils.isNotBlank(list))
                .filter(list -> list.endsWith("gmail.com") || list.endsWith("yandex.ru")
                        || list.endsWith("hotmail.com"))
                .count();
    }
}
// END
