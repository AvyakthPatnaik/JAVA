package collections;
import java.util.*;
public class Arraysortexp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>a2=new ArrayList<Integer>();
		a2.add(21);
		a2.add(12);
		a2.add(36);
		a2.add(5);
		Collections.sort(a2);
		for(Integer name:a2) {
			System.out.println(name);
		}

	}

}
