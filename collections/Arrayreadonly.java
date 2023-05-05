package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayreadonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s1=new ArrayList<String>(Arrays.asList("Jack","Jane","Jhon","Jin"));
		List<String>m1= Collections.unmodifiableList(s1);  
		s1.add(2,"Jimmy");
		System.out.println(s1);
		m1.add("Jam");
	    System.out.println(m1);
	}

}
