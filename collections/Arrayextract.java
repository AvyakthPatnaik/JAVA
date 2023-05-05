package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrayextract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s1=new ArrayList<String>();
		s1.add("Sam");
		s1.add("sun");
		s1.add("Sasi");
		s1.add("Suman");
		List<String> ss=s1.subList(1,3);
		System.out.println(ss);
		//Collections.swap(s1, 0, 3);
		//System.out.println(s1);
	}

}
