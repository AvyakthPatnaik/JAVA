package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s1=new ArrayList<String>(Arrays.asList("sam","jam","Anu","Jane"));
		System.out.println("First array list:"+s1);
		ArrayList<String> s2=new ArrayList<String>(Arrays.asList("sam","jam","Avi","Jane"));
		System.out.println("Second array list:"+s2);
		ArrayList<String>s3=new ArrayList<String>();
		boolean b1=s1.equals(s2);
		System.out.println("Contains Equal : "+b1);
		System.out.println("Equal: "+s1.equals(s2));
	    s1.retainAll(s2);
	    System.out.println("Retain All: "+s1);
	    s2.removeAll(s1);
	    System.out.println("Remove All: "+s2);
	    ArrayList<String> s11=new ArrayList<String>(Arrays.asList("sam","jam","Anu","Jane"));
		ArrayList<String> s22=new ArrayList<String>(Arrays.asList("sam","jam","Avi","Jane"));
		ArrayList<String>s33=new ArrayList<String>();
	    for(String list:s11)
	    s33.add(s22.contains(list)?"Yes":"No");
	    System.out.println("Contains: "+s33);
	    System.out.println("Stream: "+s11.stream().filter(s22::contains).collect(Collectors.toList()));
	}

}
