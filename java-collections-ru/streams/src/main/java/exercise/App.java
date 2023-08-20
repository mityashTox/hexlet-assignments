package exercise;

import java.util.List;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

// BEGIN
class App {

    public int getCountOfFreeEmails(List<String> list) {
        return (int) list.stream()
                .filter(StringUtils::isNotBlank)
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();
    }
    }
}
// END
