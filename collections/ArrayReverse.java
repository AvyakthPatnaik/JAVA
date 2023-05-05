package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>a2=new ArrayList<Integer>();
		a2.add(21);
		a2.add(12);
		a2.add(36);
		a2.add(5);
		System.out.println("ascending order:");
		Collections.sort(a2);
		for(Integer name:a2) {
			System.out.println(name);
		}
		System.out.println();
		System.out.println("Reverse order:");
		Collections.sort(a2,Collections.reverseOrder());
		for(Integer name:a2) {
			System.out.println(name);
		}

	}

}
