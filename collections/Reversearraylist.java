package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Reversearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>i1=new LinkedList<Integer>();
		i1.add(12);
		i1.add(14);
		i1.add(13);
		i1.add(25);
		i1.add(35);
		i1.add(2);
		System.out.println(i1.toString());
		Collections.reverse(i1);
		System.out.println("Reverse order: ");
		System.out.println(i1);
		Collections.sort(i1,Collections.reverseOrder());
		System.out.println("Desceding order: ");
		System.out.println(i1);
	}

}
