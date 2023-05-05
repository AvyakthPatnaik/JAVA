package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrayaddexm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s1=new ArrayList<String>();
		s1.add("Jhon");
		s1.add("Sam");
		s1.add("Ram");
		Collections.sort(s1);
		System.out.println("Elements in s1:  "+s1);
		List<String> i1=new ArrayList<String>();
		i1.add("jack");
		i1.add("Alice");
		i1.add("Abhi");
		System.out.println("Elements in i1:  "+i1);
		s1.addAll(i1);
		System.out.println("Adding to array: "+s1);
	    s1.add(1,"Gangaavva");
	    System.out.println("add: "+s1);
	    for(String str:s1) {
	    	System.out.println(str);
	    }
	    System.out.println("Size of array: "+s1.size());
	}

}
