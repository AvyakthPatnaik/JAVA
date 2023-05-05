package collections;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public class Enummapex1 {
	public enum days{
		Sunday,Monday,Tuesday,Wednesday,Friday,Saturday
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<days,String> m1=new EnumMap<days,String>(days.class);
		m1.put(days.Monday,    "2");
		m1.put(days.Tuesday,   "3");
		m1.put(days.Sunday,    "1");
		m1.put(days.Wednesday, "4");
		m1.put(days.Friday,    "5");
		m1.put(days.Saturday,  "6");
		for(Map.Entry p:m1.entrySet()) {
			System.out.println(p.getKey()+"  "+p.getValue());
		}
	}

}
