package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArraylistcolleExm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList ();
		a1.add("jane");
		a1.add("jack");
		a1.add("jhon");
		//System.out.println(a1);
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
