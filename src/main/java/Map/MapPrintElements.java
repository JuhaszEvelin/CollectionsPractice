package Map;
import java.util.*;

public class MapPrintElements {
    private static Map map;

    public static void printMap() {
        fillMap();
        traverseAndPrintMap();
    }

    public static void orderMapByKey() {
        System.out.println("************************");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
    }

    public static void orderMapByKeyReverse() {
        System.out.println("************************");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }


    public static void orderMapByValue() {
        System.out.println("************************");

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }

    public static void orderMapByValueReverse() {
        System.out.println("************************");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);

    }

    static void fillMap() {
        map = new HashMap();
        map.put(1, "alma");
        map.put(2, "körte");
        map.put(4, "banán");
        map.put(9, "eper");
    }

    static void traverseAndPrintMap(){
        Set set = map.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry)      iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
