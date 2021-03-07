package Set;

import java.util.HashSet;
import java.util.Set;

public class OperationsSetInterface<E> {
    Integer[] arrA = {1, 5, 9, 11, 8};
    Integer[] arrB = {1, 4, 8, 10, 93};
    public Set<?> A = Set.<Integer>of(arrA);
    public Set<?> B = Set.<Integer>of(arrB);


    /**
     * you can do basic math operations on interface such as:
     */

    public Set<E> union(Set<E> setA, Set<E> setB){
        Set<E> result = new HashSet(setA);
        result.addAll(setB);
        System.out.println(result);
        return result;
    }

    public Set<E> difference(Set<E> setA, Set<E> setB){
        Set<E> result = new HashSet(setA);
        result.removeAll(setB);
        System.out.println(result);
        return result;
    }


    public Set<E> intersection(Set<E> setA, Set<E> setB){
        Set<E> result = new HashSet(setA);
        result.retainAll(setB);
        System.out.println(result);
        return result;
    }


}
