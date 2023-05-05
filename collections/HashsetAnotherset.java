package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashsetAnotherset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>a1=new ArrayList(Arrays.asList("Jack","Jim","Jhon","Jin"));
		System.out.println("Arraylist elements: "+a1);
		HashSet<String>h1=new HashSet<String>(a1);
		h1.add("Sam");
		h1.add("Sun");
		for(String str:h1) {
			System.out.println(str);
		}
	}
}
