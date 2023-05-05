package collections;

import java.util.LinkedList;

public class CompareLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>l1=new LinkedList<String>();
		l1.add("Sam");
		l1.add("Suman");
		l1.add("Saint");
		System.out.println("first:"+l1);
		LinkedList<String>l2=new LinkedList<String>();
		l2.add("Jack");
		l2.add("Jhon");
		l2.add("Saint");
		LinkedList<String>l3=new LinkedList<String>();
		for(String e:l1) 
			l3.add(l2.contains(e)?"Yes":"No");
		System.out.println(l3);

	}

}
