package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> s1=new LinkedList<String>();
		s1.add("Jhon");
		s1.add("Sam");
		s1.add("Ram");
		Collections.sort(s1);
		System.out.println("Elements in s1:  "+s1);
		LinkedList<String> i1=new LinkedList<String>();
		i1.add("jack");
		i1.add("Alice");
		i1.add("Abhi");
		System.out.println("Elements in i1:  "+i1);
		s1.addAll(i1);
		System.out.println("Adding to array: "+s1);
	    s1.add(1,"Gangaavva");
	    System.out.println("add: "+s1);
	    s1.addFirst("Alice");
	    System.out.println("First element:"+s1);
	    s1.addLast("Ram");
	    System.out.println("Adding last element: "+s1);
	    
	    s1.remove(1);
	    System.out.println("Removing Gangaavva: "+s1);
	    s1.removeFirst();
	    System.out.println("Removing first: "+s1);
	    s1.removeLast();
	    System.out.println("Removing last: "+s1);
	    s1.removeFirstOccurrence("Alice");
	    System.out.println("Removing firstoccurance element:"+s1);
	    s1.removeLastOccurrence("Alice");
	    System.out.println("Remove lastoccurance Element:"+s1);
	    for(String str:s1) {
	    	System.out.println(str);
	    }
	    System.out.println("Size of array: "+s1.size());
	    Collections.sort(s1,Collections.reverseOrder());
	    System.out.println("Reverse order: "+s1);

	}

}
