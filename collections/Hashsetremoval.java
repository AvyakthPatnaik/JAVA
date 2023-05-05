package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetremoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>h1=new HashSet<String>();
		h1.add("Sam");
		h1.add("Jack");
		h1.add("Jim");
		h1.add("jimmy");
		h1.add("Jhon");
		h1.add("Jim");
		h1.add("Jim");
		h1.add("Jhon");
		h1.add("Sam");
		h1.add("Jack");
		Iterator itr=h1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		/*System.out.println("Hashset :"+h1);
		h1.remove("jack");
		System.out.println("removing jack: "+h1);
		HashSet<String>h2=new HashSet<String>();
		h2.add("Ram");
		h2.add("jhon");
		h2.add("Kial");
		System.out.println("hashset 2:"+h2);
		h1.addAll(h2);
		System.out.println("Adding hashset: "+h1);
		h1.removeAll(h2);
		System.out.println("removing hashset2: "+h1);
		h1.removeIf(str->str.contains("Sam"));
		System.out.println("using removelf: "+h1);
		h1.clear();
		System.out.println(h1);*/
	}

}
