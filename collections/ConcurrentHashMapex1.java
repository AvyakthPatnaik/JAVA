package collections;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ConcurrentHashMap<String, Integer> m = new  ConcurrentHashMap<>();   
    m.put("k1", 100);   
    m.put("k2", 200);   
    m.put("k3", 300);   
    m.put("k4", 400);   
    System.out.println("HashMap values :\n " + m.toString());    
    m.computeIfAbsent("k5",k->200+300);   
    m.computeIfAbsent("k6",k->60*10);   
    System.out.println("New HashMap after computeIfAbsent :\n "+ m); 
    System.out.println("containsvalue:"+m.containsValue(300));
    System.out.println("Compute k3: "+m.compute("k3",(key,val)->val+300));
    System.out.println(m);
    m.computeIfPresent("k4",(key,val)->val + 100);   
    m.computeIfPresent("k5",(key,val)->val + 100);   
    System.out.println("New HashMap after computeIfPresent :\n "+ m);
    System.out.println("containskey: "+m.containsKey("k5")+"\n"+"containsvalue: "+m.containsValue(100));
    Enumeration enumr=m.elements();
    while (enumr.hasMoreElements()) {   
        System.out.println("elements: "+enumr.nextElement());   
    }   
    Set myset=m.entrySet();  
    System.out.println("EntrySet: "+myset);  
    ConcurrentHashMap<String , Integer>  mymap2 =  m; 
    System.out.println("Equal: "+m.equals(mymap2));
    System.out.println("get: "+m.get("k3"));
    System.out.println("hashcode: "+m.hashCode());
    Enumeration enumr1 = m.keys();   
    System.out.println("enumeration of keys are:");   
    while (enumr1.hasMoreElements()) {   
        System.out.println(enumr1.nextElement());
    }
    System.out.println("keySet : "+m.keySet());
    System.out.println("size of map after clearing: "+m.mappingCount()); 
    m.putIfAbsent("k7",  21);   
    System.out.println("putIfAbsent : "+ m);  
    m.remove("k3", 600);
    System.out.println("remove:" +m);
    m.replace("k1", 50);
    System.out.println("Replace: "+m);
    System.out.println("tostring: "+m.toString());
    
	}

}
