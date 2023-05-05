package collections;

import java.util.EnumMap;
import java.util.Map;

class Book22{
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Book22(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
}
public class Enumbookex1 {
	public enum Key{  
        One, Two, Three  
        };  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 EnumMap<Key, Book22> map = new EnumMap<Key, Book22>(Key.class);   
	     Book22 b1=new Book22(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		 Book22 b2=new Book22(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		 Book22 b3=new Book22(103,"Operating System","Galvin","Wiley",6);       
		 map.put(Key.One, b1);  
		 map.put(Key.Two, b2);  
		 map.put(Key.Three, b3);   
		 for(Map.Entry<Key, Book22> entry:map.entrySet()){      
		     Book22 b=entry.getValue();    
		     System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);     
		 }       

	}

}
