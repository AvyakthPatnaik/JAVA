package collections;

import java.util.HashSet;
import java.util.LinkedList;

public class HashsetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>h1=new HashSet<String>();
		h1.add("Sam");
		h1.add("Jack");
		h1.add("Jim");
		h1.add("jimmy");
		h1.add("Jhon");
		System.out.println("first hash");
		System.out.println(h1);
		HashSet<String>h2=new HashSet<String>();
		h2.add("Sam");
		h2.add("Kia");
		h2.add("Jim");
		h2.add("Gangaavva");
		h2.add("GInna");
		System.out.println("Second hash");
		System.out.println(h2);
		h1.retainAll(h2);
		System.out.println(h1);
	}

}
