import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (!map.containsKey(current))
                map.put(current, 0);
            map.replace(current, map.get(current) + 1);
        }
        int max = Collections.max(map.values());
        for (char current: map.keySet()) {
            if (map.get(current) == max)
                return current;
        }
        return ' ';
    }
}
