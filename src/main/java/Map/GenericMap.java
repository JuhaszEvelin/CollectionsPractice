package Map;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {
    public static Map<Integer, String> map;

    public static void printGenericMap(){
        fillMap();
        traverseAndPrintMap();
    }

    public static void fillMap(){
        map = new HashMap();
        map.put(101, "Vijay");
        map.put(100, "Amit");
        map.put(102, "Rahul");
    }

    public static void traverseAndPrintMap(){
        for(Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
