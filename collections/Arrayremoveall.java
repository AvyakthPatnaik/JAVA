package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrayremoveall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s1=new ArrayList<String>(Arrays.asList("sam","jam","Anu","Jane"));
		System.out.println("First array list:"+s1);
		List<String> s2=new ArrayList<String>(Arrays.asList("sam","jam","Avi","Jane"));
		System.out.println("First array list:"+s2);
		s1.removeAll(s2);
		System.out.println("uncommonelements:"+s1);
		//s2.retainAll(s1);
		//System.out.println("retainelements:"+s2);

	}

}
