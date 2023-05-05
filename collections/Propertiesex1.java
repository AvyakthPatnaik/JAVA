package collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Propertiesex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("D:\\java.txt");  
	    Properties p=new Properties();  
	    p.load(reader);    
	    System.out.println(p.getProperty("user"));  
	    System.out.println(p.getProperty("password"));  
	    Set set=p.entrySet();  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	    Map.Entry entry=(Map.Entry)itr.next();  
	    System.out.println(entry.getKey()+" = "+entry.getValue());  
	    }
	    Properties p1=new Properties(); 
	    p1.setProperty("name","Sonoo Jaiswal");  
	    p1.setProperty("email","sonoojaiswal@javatpoint.com");  
	      
	    p1.store(new FileWriter("D:\\java.txt"),"Details ");  
	}

}
