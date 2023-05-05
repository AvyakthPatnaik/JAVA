package collections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>ts=new TreeSet<String>(Arrays.asList("Lion","Tiger","Wlof","Rabbit"));
		System.out.println("orginal: "+ts);
		Iterator itr=ts.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("lowest value: "+ts.pollFirst());
		System.out.println("Highest value: "+ts.pollLast());
		System.out.println("Head set: "+ts.headSet("Wolf",true));
		System.out.println("Subset: "+ts.subSet("Lion",true, "Wolf", false));
		System.out.println("Tail set:"+ts.tailSet("Rabbit",true));
	}

}
