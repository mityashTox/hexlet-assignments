package exercise;

import org.apache.commons.lang3.StringUtils;
import java.util.List;

// BEGIN
class App {
    public static int getCountOfFreeEmails(List<String> emailsList) {
        return (int) emailsList.stream()
                .filter(StringUtils::isNotBlank)
                .filter(email -> email.endsWith("gmail.com") || email.endsWith("yandex.ru")
                        || email.endsWith("hotmail.com"))
                .count();
    }
}
// END