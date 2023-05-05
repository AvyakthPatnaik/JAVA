package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s1=new ArrayList<String>(Arrays.asList("sam","jam","Anu","Jane"));
		System.out.println("First array list:"+s1);
		List<String> s2=new ArrayList<String>(Arrays.asList("sam","jam","Avi","Jane"));
		System.out.println("First array list:"+s2);
		ArrayList<String>s3=new ArrayList<String>();
		for(String l1:s1) 
			s3.add(s2.contains(l1)?"Yes":"No");
			System.out.println("Comparing Array: "+s3);
			System.out.println("Stream: "+s1.stream().filter(s2::contains).collect(Collectors.toList()));			
	}

}
