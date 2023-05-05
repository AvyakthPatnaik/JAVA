package collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Mapgeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(4,"Sam");
		m1.put(3,"Jack");
		m1.put(2,"Abhi");
		m1.put(1,"Bhai");
		m1.put(5,"Cat");
		for(Map.Entry e:m1.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println(" ");
		System.out.println("comparing by keys");
		m1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println(" ");
		System.out.println("comparing & reverse by keys");
		m1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		System.out.println(" ");
		System.out.println("comparing by values");
		m1.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println(" ");
		System.out.println("comparing & reverse by values");
		m1.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		}
}
