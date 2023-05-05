package collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>lh=new LinkedHashSet<String>(Arrays.asList("Jack","Jhon","Jimmy","cat","Avi"));
		System.out.println("Orginal: "+lh);
		LinkedHashSet<String>lh1=new LinkedHashSet<String>(Arrays.asList("Jill","Jane","Jet","can","Allica"));
		lh.addAll(lh1);
		System.out.println("Addall: "+lh);
		lh.remove("Jimmy");
		System.out.println("after removal:");
		Iterator itr=lh.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		lh.retainAll(lh1);
		System.out.println("retain all: "+lh);
		lh.removeAll(lh1);
		System.out.println("removeall: "+lh);
	}
}
