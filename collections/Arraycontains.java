package collections;
import java.util.ArrayList;
import java.util.List;

public class Arraycontains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s1=new ArrayList<String>();
		s1.add("Jhon");
		s1.add("Sam");
		s1.add("Ram");
		System.out.println("First Array: "+s1);
		ArrayList<String> s2=new ArrayList<String>();
		s2.add("Jhon");
		s2.add("Sam");
		s2.add("Ram");
		System.out.println("Second Array: "+s2);
		boolean b1=s1.equals(s2);
		System.out.println("Equal elements in s1&s2: "+b1);
		s2.add("Tom");
		boolean b2=s1.equals(s2);
		System.out.println("Equal elements in s1&s2: "+b2);
		s2.removeAll(s1);
		System.out.println(s2);
	}

}
