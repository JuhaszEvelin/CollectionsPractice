package Set;
import java.util.*;

public class GeneralSet<E> {

    public Set<E> createHashSet() {
        // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("egy");
        hash_Set.add("kető");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println(hash_Set);
        return (Set<E>) hash_Set;
    }
}
