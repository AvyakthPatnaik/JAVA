package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmapex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm1=new HashMap<Integer,String>();
		hm1.put(1,"Lion");
		hm1.put(2,"Tiger");
		hm1.put(3,"Cheeta");
		hm1.put(4,"Beer");
		for(Map.Entry m:hm1.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		System.out.println("values in map");
		hm1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("values in reverse map");
		hm1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	}

}
