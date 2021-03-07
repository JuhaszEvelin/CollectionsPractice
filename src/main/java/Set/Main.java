package Set;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //showGeneralSet();
        //showSortedSet();
        //showNavigableSet();
       // showTreeSet();
        // showHashSet();
        showQueueExample();

    }

    private static void showQueueExample() {
        QueueExample qe = new QueueExample();
        qe.example();
    }

    private static void showHashSet() {
        HashSetExample hse = new HashSetExample();
        hse.example();
    }

    private static void showTreeSet() {
        TreeSetExample tse = new TreeSetExample();
        tse.example();
    }

    private static void showNavigableSet() {
        NavigableSetExample nse = new NavigableSetExample();
        nse.example();
    }

    private static void showSortedSet() {
        SortedSetExample sse = new SortedSetExample();
        sse.example();
    }

    private static void showGeneralSet() {
        OperationsSetInterface osi = new OperationsSetInterface();
        System.out.println("Set union");
        osi.union(osi.A, osi.B);
        System.out.println("Set difference");
        osi.difference(osi.A, osi.B);
        System.out.println("Set intersection");
        osi.intersection(osi.A, osi.B);
    }
}
