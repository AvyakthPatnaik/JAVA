package collections;

import java.util.TreeMap;

public class Treemapex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(1,"Smith");
		tm.put(2,"Sunny");
		tm.put(3,"Smile");
		tm.put(4,"Sweety");
		System.out.println("headMap: "+tm.headMap(2));  
		System.out.println("tailMap: "+tm.tailMap(2));  
		System.out.println("subMap: "+tm.subMap(1,3));   
	}

}
