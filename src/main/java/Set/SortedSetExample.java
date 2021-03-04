package Set;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample<E> {
    Integer[] numbers = {1, 2, 5, 7, 11};
    SortedSet<Integer> set = new TreeSet();

    public void example(){
        set.addAll(Arrays.asList(numbers));
        System.out.println("First: "+set.first());
        System.out.println("Last: "+set.last());
        System.out.println("Till  5.: "+set.headSet(5));
        System.out.println("From 5.: "+set.tailSet(5));
        System.out.println("Subset between, 2 and 11: " + set.subSet(2, 11));

    }


}
