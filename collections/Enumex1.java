package collections;

import java.util.EnumSet;
import java.util.Set;

enum days{
	Sunday,Monday,Tuesday,Wednesday,Friday,Saturday
}
public class Enumex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<days>en=EnumSet.of(days.Tuesday,days.Saturday);
		for(days s:en) {
			System.out.println(s);
		}
		System.out.println();
		Set<days>en1=EnumSet.allOf(days.class);
		System.out.println("All days: "+en1);
		System.out.println();
		Set<days>en2=EnumSet.noneOf(days.class);
		System.out.println("All days: "+en2);
	}

}
