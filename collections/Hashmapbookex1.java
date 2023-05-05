package collections;

import java.util.HashMap;
import java.util.Map;

class Books11{
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Books11(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
}
public class Hashmapbookex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Books11>map=new HashMap<Integer,Books11>();
		Books11 b1=new Books11(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Books11 b2=new Books11(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		Books11 b3=new Books11(103,"Operating System","Galvin","Wiley",6);
		map.put(1,b1);  
	    map.put(2,b2);  
	    map.put(3,b3);  
	    for(Map.Entry<Integer, Books11> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Books11 b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }    

	}

}
