package collections;

import java.util.ArrayList;

public class Arraysize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s1=new ArrayList<String>();
		s1.add("Sam");
		s1.add("sun");
		s1.add("Sasi");
		s1.add("Suman");
		for(int i=0;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}

	}

}
