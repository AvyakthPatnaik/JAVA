package collections;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
public class DequeuEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>d=new ArrayDeque<String>();
		d.add("Sunday");  
        d.add("Monday");  
        d.add("Tuesday");  
        d.add("Wednesday");  
        d.add("Thursday");  
        d.add("Friday");  
        d.add("Saturday");
        System.out.println("Week : "+d);
        Deque<String>d1=new ArrayDeque<String>();
        d1.add("Jan");  
        d1.add("Feb");  
        d1.add("Mar");  
        d1.add("Apr");  
        d1.add("May");  
        d1.add("Jun");  
        d1.add("July");
        System.out.println("Month: "+d1);
        d.addAll(d1);
        System.out.println("AddAll: "+d);
        d.addFirst("Week");
        d.addLast("month");
        System.out.println("Add first&Last: "+d);
        System.out.println("Contains : "+d.contains("Jan"));
        Iterator<String>itr=d.descendingIterator();
        while(itr.hasNext()) {
        	System.out.println("Descending: "+itr.next());
        }
        System.out.println("Element: "+d.element());
        System.out.println("Get First: "+d.getFirst()+"\n"+"GetLast: "+d.getLast());
        d.offer("Sam");
        d.offerFirst("Cal");
        d.offerLast("Jail");
        System.out.println("Offer: "+d);
        System.out.println("peek: "+d.peek()+"\n"+"peekfirst: "+d.peekFirst()+"\n"+"peeklast: "+d.peekLast());
        System.out.println("poll: "+d.poll()+"\n"+"pollfirst: "+d.pollFirst()+"\n"+"polllast: "+d.pollLast());
        System.out.println("after poll"+d);
        d.pop();
        System.out.println("pop: "+d);
        d.push("VVVV");
        d.push("2023");
        System.out.println("push: "+d);
        System.out.println("remove: "+d.remove()+"\n"+"removefirst: "+d.removeFirst()+"\n"+"removelast: "+d.removeLast());
        System.out.println("After removal: "+d);
        System.out.println("removefirstoccurrence: "+d.removeFirstOccurrence("month")
        +"\n"+"removelastoccurrence: "+d.removeLastOccurrence("Jan"));
        System.out.println("After removeoccurance: "+d);
	}

}
