package Set;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample<E> {

    public NavigableSet<Integer> set = new TreeSet();
    public Integer[] numbers = {1, 2, 5, 7, 11};

    public void example(){
        set.addAll(Arrays.asList(numbers));
        System.out.println("original order: " + set);
        System.out.println("reverse order: "+ set.descendingSet());
        System.out.println("Ceiling 1st element: "+set.ceiling(set.first()));
        System.out.println("Floor 1st element: "+set.floor(set.first()));
        System.out.println("Higher 1st element: "+set.higher(set.first()));
        System.out.println("Lower 1st element: "+set.lower(set.first()));


    }



}
