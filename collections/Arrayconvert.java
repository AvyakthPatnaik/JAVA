package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arrayconvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>s1=new ArrayList<String>(Arrays.asList("Jack","Jane","Jhon","Jin"));
		String[] item = s1.toArray(new String[s1.size()]);  
        for(String s : item){  
            System.out.println(s);  
        }  
        System.out.println("Converting Array to ArrayList" );  
        List<String>l2 = new ArrayList<>();  
        l2 =  Arrays.asList(item);  
        System.out.println(l2);  
        
        Integer[] arr={81,82,83,84,85};
        System.out.println("Elements of Array are:");
        for (int a: arr)
        {
            System.out.println(a);
        }
        List<Integer> list=Arrays.asList(arr);
        System.out.println("Elements of list are:");
        System.out.println(list);
  
	}

}
