package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put(4,"Sam");
		m1.put(3,"Jack");
		m1.put(2,"Abhi");
		m1.put(1,"Bhai");
		m1.put(5,"Cat");
		Set s1=m1.entrySet();
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry e=(Map.Entry)itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
