package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String config) {
        StringBuilder sb = new StringBuilder();
        String[] arrayOfConfigElements = config.split("\n");
        for (String line : arrayOfConfigElements) {
            if (line.startsWith("environment")) {
                Arrays.stream((line.substring(12).split(",")))
                        .filter(i -> i.contains("X_FORWARDED_"))
                        .map(i -> i.replace("X_FORWARDED_", ""))
                        .forEach(i -> sb.append(i).append(","));
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }
}
//END
