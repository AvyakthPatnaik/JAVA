package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Arrayiterationexm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a1=new ArrayList<String>();
		a1.add("sunil");
		a1.add("Ajay");
		a1.add("Ravi");
		System.out.println("Using list iterator:");
		ListIterator<String>l1=a1.listIterator(a1.size());
		while(l1.hasPrevious()) {
			String str=l1.previous();
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Using forloop");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println();
		System.out.println("using for each loop");
		for(String name:a1) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("using for each remaining loop");
		Iterator<String>itr=a1.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});

	}

}
