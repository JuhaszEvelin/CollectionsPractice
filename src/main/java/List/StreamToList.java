package List;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToList {

    public static void main(String[] args) {


        //    Például ha az eredményt listába szeretnénk összegyűjteni, akkor azt három féle képpen tehetjük meg:

        Stream<Integer> stream = Stream.of(3, 5, 6);
        stream.collect(ArrayList::new, List::add, List::addAll);
        stream.collect(Collectors.toCollection(ArrayList::new));
        stream.collect(Collectors.toList());
    }

}

