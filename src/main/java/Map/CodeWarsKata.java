package Map;
import java.util.*;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class CodeWarsKata {
    /**
     * https://www.codewars.com/kata/5b16490986b6d336c900007d
     *
     * You are given a dictionary/hash/object containing some languages and your
     * test results in the given languages. Return the list of languages where
     * your test score is at least 60, in descending order of the results.
     */
    private static Map<String, Integer> myMap;

    public static void checkResult(){
        myMap = new HashMap();
        myMap.put("Java", 10);
        myMap.put("Ruby", 80);
        myMap.put("Python", 65);
        System.out.println(myLanguages(myMap).toString());
}

    public static List<String> myLanguages(final Map<String, Integer> results) {

        return results
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .filter(a -> a.getValue() >= 60)
                .map(Map.Entry::getKey)
                .collect(toList());
    }
}
