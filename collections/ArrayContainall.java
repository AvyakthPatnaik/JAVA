package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayContainall {
	public static boolean compareList(ArrayList l1,ArrayList l2) {
		return l1.toString().contentEquals(l2.toString())?true:false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s1=new ArrayList<String>(Arrays.asList("sam","jam","Anu","Jane"));
		ArrayList<String> s2=new ArrayList<String>(Arrays.asList("sam","jam","Anu","Jane"));
		System.out.println(""+compareList(s1,s2));
		s2.add("jack");
		System.out.println(""+compareList(s1,s2));
	}

}
