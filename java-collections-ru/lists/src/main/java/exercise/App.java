package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        letters = letters.toLowerCase();
        word = word.toLowerCase();
        List<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
        List<String> letterList = new ArrayList<>(Arrays.asList(letters.split("")));
        for (String wordLetter : wordList) {
            if (letterList.contains(wordLetter)) {
                letterList.remove(wordLetter);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
