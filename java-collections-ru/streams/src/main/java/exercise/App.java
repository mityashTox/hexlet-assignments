package exercise;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

// BEGIN
class App {

    public int getCountOfFreeEmails(List<String> list) {
        return (int) list.stream()
                .filter(StringUtils::isNotBlank(list))
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();
    }
}
// END
