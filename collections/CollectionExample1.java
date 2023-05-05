package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		set.add(2);  
        set.add(5);  
        System.out.println("Initial collection :"+set);
        Collections.addAll(set, 11, 12, 13, 14, 15);  
        System.out.println("Final Collection Addall : "+set);
        System.out.println("Size: "+set.size());
        System.out.println("contains: "+set.contains(13));
        System.out.println("containsall: "+set.containsAll(set));
        System.out.println("Equals: "+set.equals(13));
        System.out.println("hashcode: "+set.hashCode());
        System.out.println("isempty: "+set.isEmpty());
        System.out.println("retain: "+set.retainAll(set));
        Iterator itr=set.iterator();
        while(itr.hasNext()) {
        System.out.println("Iteration: "+itr.next());
        }
        Object[] arr=set.toArray();
        System.out.println("TO Array: "+arr);
        System.out.println("remove: "+set.remove(13));
        System.out.println("removeall: "+set.removeAll(set));
        set.clear();
        System.out.println("clear: "+set);
	}

}
