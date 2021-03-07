package Set;
import java.util.*;

public class QueueExample {
    public void example(){
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        queue.offer(2);
        queue.offer(6);
        queue.offer(11);
        queue.offer(1);
        queue.offer(9);
        System.out.print("the head is:"+queue.peek());
        System.out.println("\n traverse using iterators: ");
        Iterator iterator=queue.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println("\n traverse using poll-offer: ");
        //TODO since this is ordered by value, 1 is always smallest,
        //TODO make an example where Comparator is insertion order
        //TODO then you can iterate it with this method
        for (int i = 0; i < queue.size(); i++) {
            Integer temp = queue.poll();
            queue.offer(temp);
            System.out.print(temp+ " ");
        }
        queue.remove();
        queue.poll();
        System.out.println("the head is after removing two elements: "+queue.peek());
    }
}

