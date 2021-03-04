package Set;
import java.lang.reflect.Array;
import java.util.*;

public class GeneralSet<E> {
    Integer[] arrB = {1, 4, 8, 10, 93};

    public Set<E> createWithAdd() {
        // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("one");
        hash_Set.add("two");
        hash_Set.add("bal");
        hash_Set.add("jobb");
        hash_Set.add("egyedem-megyedem");

        System.out.println(hash_Set);
        return (Set<E>) hash_Set;
    }


    public Set<E> createWithArray(E[] arr){
        Set<E> B = Set.<E>of(arr);
        return B;
    }

    public Set<E> createWithAddArray(E[] arr){
        Set<E> set1 = new HashSet();
        set1.addAll(Arrays.asList(arr));
        return set1;
    }

}
