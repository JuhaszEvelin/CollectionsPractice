package Set;

public class Main {

    public static void main(String[] args) {
        showGeneralSet();
        showSortedSet();

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
