package Map;
import java.util.*;


public class Main {

    public static void main (String[] args) {
        /**
         * old type non generic map - traversed with Set
         */
        MapPrintElements.printMap();

        /**
         * sorting by
         * .sorted(Map.Entry.comparingByValue())
         * .sorted(Map.Entry.comparingByKey())
         */
        MapPrintElements.orderMapByKey();
        MapPrintElements.orderMapByKeyReverse();
        MapPrintElements.orderMapByValue();
        MapPrintElements.orderMapByValueReverse();


        /**
         * Generic map - fill up and travers with enhanced for loop
         */

        GenericMap.printGenericMap();

        /**
         * codewars kata
         */

        System.out.println("**************************");
        CodeWarsKata.checkResult();

        /**
         * test
         */
        String s = "He is a very very good boy, isn't he?";
        String[] tokens = s.trim().split("[!,?._'@ ]+");
        System.out.println(Arrays.toString(tokens));
        String[] result = Arrays.stream(s.trim().split("\\W|_")).filter(n->n != "").toArray(String[]::new);



    }
}

