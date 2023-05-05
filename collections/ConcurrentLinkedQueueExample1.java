package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();    
	    queue.add(11);  
	    queue.add(100);  
	    queue.add(122);  
	    queue.add(102);  
	    queue.add(112);    
	    System.out.println("Elements in queue : "+queue);  
	    queue.remove(122);  
	    queue.remove(102);  
	    System.out.println("Remaining elements in queue : "+queue);
	    ConcurrentLinkedQueue<Integer> queue1 = new ConcurrentLinkedQueue<Integer>();
	    queue1.add(22);  
	    queue1.add(200);  
	    queue1.add(222);  
	    queue1.add(202);  
	    queue1.add(212);
	    queue.addAll(queue1);
	    System.out.println("AddAll: "+queue);
	    queue.removeAll(queue1); 
	    System.out.println("Elemts of the list will get removed : "+queue);    
	    queue.retainAll(queue1);  
	    System.out.println("Queue will retain the elements of the list: "+queue);  
	    System.out.println("Size: "+queue.size());
	    System.out.println("contains: "+queue.contains("202"));
	    System.out.println("isempty: "+queue.isEmpty());
	    queue.offer(301);
	    queue.offer(302);
	    System.out.println("offer: "+queue);
	    Iterator<Integer> iterator = queue.iterator();   
	    while (iterator.hasNext()) {  
	      System.out.println("iteration: "+iterator.next());  
	          }  
	    Object[] a=queue.toArray();  
        for(int i=0 ;i<a.length;i++){  
            System.out.println("toarray " +": "+ a[i]);  
        }   

	}

}
