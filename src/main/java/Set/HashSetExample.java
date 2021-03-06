package Set;

import java.lang.reflect.Array;
import java.util.*;

public class HashSetExample {
     HashSet<String> setA=new HashSet<String>();
     List<String> fruits = new ArrayList(Arrays.asList("citrom", "narancs", "grapefruit"));
    HashSet<String> setB=new HashSet(fruits);

     public void example(){
         //adding elements
         setA.add("alma");
         setA.add("körte");
         setA.add("banán");
         setA.add("eper");
         setA.addAll(setB);


         //iteration
         setB.forEach(System.out::println);
         Iterator iterator = setA.iterator();
         while(iterator.hasNext()){
             System.out.print(iterator.next()+" ");
         }

         //removing
         setA.removeAll(setB);
         setA.removeIf(fruit->fruit.contains("eper"));
         setA.clear();

    }
}
