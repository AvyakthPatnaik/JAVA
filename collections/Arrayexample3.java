package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrayexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>a1=new ArrayList<String>();
		a1.add("sunil");
		a1.add("Ajay");
		a1.add("Ravi");
		System.out.println("getting element: "+a1.get(1));
		a1.set(0, "Avi");
		System.out.println("After get nd set: "+a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
