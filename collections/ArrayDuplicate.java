package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("sam");
		a1.add("sasi");
		a1.add("sun");
		a1.add("sam");
		System.out.println(a1);
		Set<String>s=new LinkedHashSet<String>(a1);
		System.out.println(s);
	}

}
